package irvine.math.polynomial;

import java.util.ArrayList;

import irvine.factor.factor.Cheetah;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.math.Mobius;
import irvine.util.Pair;

/**
 * Cycle index exponentiation operation. Computes <code>Z([A]^B)</code>
 * from <code>Z(A)</code> and <code>Z(B)</code> using the method
 * described by Palmer and Robinson in "Enumeration Under Two Representations
 * of the Wreath Product"
 * @author Sean A. Irvine
 */
public final class WreathExponentiation {

  private WreathExponentiation() { }

  // Equation (6)
  private static Z i(final MultivariateMonomial beta, final String indet, final int r, final int v) {
    Z pow = Z.ZERO;
    for (final Z ww : Cheetah.factor(v).divisors()) {
      final long w = ww.longValueExact();
      final long mu = Mobius.mobius(v / w);
      if (mu != 0) {
        final long g = LongUtils.gcd(w, r); // actually an int since v was
        Z sum = Z.ZERO;
        for (final Z kk : Cheetah.factor(w / g).divisors()) {
          final int k = kk.intValue();
          final Z jk = beta.get(new Pair<>(indet, k));
          sum = sum.add(jk.multiply(k));
        }
        pow = pow.signedAdd(mu > 0, sum.pow(g));
      }
    }
    return pow.divide(v);
  }

  // Equation (5)
  private static MultivariateMonomial i(final MultivariateMonomial beta, final int n, final String indet, final int r) {
    final MultivariateMonomial ir = new MultivariateMonomial();
    ir.setCoefficient(beta.getCoefficient());
    final int nr = Z.valueOf(n).pow(r).intValueExact();
    for (int v = 1; v <= nr; ++v) {
      final Z iv = i(beta, indet, r, v);
      ir.add(v, iv);
    }
    return ir;
  }

  private static String getIndeterminate(final CycleIndex c) {
    String indet = null;
    for (final MultivariateMonomial beta : c.values()) {
      for (final Pair<String, Integer> t : beta.keySet()) {
        if (indet == null) {
          indet = t.left();
        } else if (!indet.equals(t.left())) {
          throw new IllegalArgumentException();
        }
      }
    }
    return indet;
  }

  // I_r(Z(B))
  static CycleIndex i(final CycleIndex b, final int r) {
    final CycleIndex ir = new CycleIndex("I_" + r + "(" + b.getName() + ")");
    final String indet = getIndeterminate(b);
    final int n = b.maxIndex();
    for (final MultivariateMonomial beta : b.values()) {
      ir.add(i(beta, n, indet, r));
    }
    return ir;
  }

  /**
   * Compute cycle index exponentiation <code>Z([B]^A)</code>.
   * @param op underlying multiply
   * @param b base
   * @param a exponent
   * @return cycle index
   */
  static CycleIndex exponentiation(final MultivariateMonomialOperation op, final CycleIndex b, final CycleIndex a) {
    final int max = a.maxIndex();
    final ArrayList<CycleIndex> i = new ArrayList<>();
    i.add(null); // index 0
    for (int r = 1; r <= max; ++r) {
      i.add(i(b, r));
    }
    // Substitute I_r into a
    final CycleIndex res = a.apply(op, i);
    res.setName("[" + a.getName() + "]^(" + b.getName() + ")");
    return res;
  }

  /**
   * Compute cycle index exponentiation <code>Z([B]^A)</code>.
   * @param b base
   * @param a exponent
   * @return cycle index
   */
  public static CycleIndex exponentiation(final CycleIndex b, final CycleIndex a) {
    return exponentiation(HararyMultiply.OP, b, a);
  }
}
