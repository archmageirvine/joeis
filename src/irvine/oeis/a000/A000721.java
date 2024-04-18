package irvine.oeis.a000;

import java.util.ArrayList;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.group.SymmetricGroup;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.HararyMultiply;
import irvine.math.polynomial.MultivariateMonomial;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.util.Pair;

/**
 * A000721 Number of balanced Boolean functions of n variables.
 * @author Sean A. Irvine
 */
public class A000721 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A000721(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A000721() {
    super(1);
  }

  /*
    Computation follows the method described in "Enumerating Types of
    Boolean Functions" by Alasdair Urquhart.  As such it is quite a
    lot more general than this sequence, and actually computes successive
    generating functions (by n) for the number of boolean functions with
    n outputs and k true outputs.  This sequence has k == 2^(n-1).
  */

  private static Z e(final int v) {
    Z s = Z.ZERO;
    for (final Z dd : Jaguar.factor(v).divisors()) {
      final int d = dd.intValue();
      final int m = Functions.MOBIUS.i((long) (v / d));
      if (m != 0) {
        s = s.signedAdd(m == 1, Z.ONE.shiftLeft(d));
      }
    }
    return s.divide(v);
  }

  private static Z g(final int v) {
    if ((v & 1) == 1) {
      return Z.ZERO;
    }
    Z s = Z.ZERO;
    final int m = v / 2;
    for (final Z dd : Jaguar.factor(v).divisors()) {
      final int d = dd.intValue();
      if (m % d != 0) {
        final int t = Functions.MOBIUS.i((long) (v / d));
        if (t != 0) {
          s = s.signedAdd(t == 1, Z.ONE.shiftLeft(d / 2));
        }
      }
    }
    return s.divide(v);
  }

  private CycleIndex z(final int n) {
    return SymmetricGroup.create(n).cycleIndex();
  }

  MultivariateMonomial ia1(final int r) {
    final MultivariateMonomial res = new MultivariateMonomial();
    for (final Z vv : Jaguar.factor(r).divisors()) {
      final int v = vv.intValue();
      res.add(v, e(v));
    }
    return res;
  }

  private MultivariateMonomial ia2(final int r) {
    final MultivariateMonomial res = new MultivariateMonomial();
    final int rr = 2 * r;
    for (final Z vv : Jaguar.factor(rr).divisors()) {
      final int v = vv.intValue();
      if (r % v != 0) {
        res.add(v, g(v));
      }
    }
    return res;
  }

  protected CycleIndex iZ2(final int r) {
    final CycleIndex iz = new CycleIndex("I(Z(2))");
    final MultivariateMonomial m1 = ia1(r);
    m1.setCoefficient(Q.HALF);
    iz.add(m1);
    final MultivariateMonomial m2 = ia2(r);
    m2.setCoefficient(Q.HALF);
    iz.add(m2);
    return iz;
  }

  private CycleIndex power(final CycleIndex ci, final Z power) {
    CycleIndex c = ci;
    for (Z k = Z.TWO; k.compareTo(power) <= 0; k = k.add(1)) {
      c = c.op(HararyMultiply.OP, ci);
    }
    return c;
  }

  private CycleIndex multiply(final CycleIndex a, final CycleIndex b) {
    if (a.isEmpty()) {
      return b;
    }
    if (b.isEmpty()) {
      return a;
    }
    return a.op(HararyMultiply.OP, b);
  }

  protected CycleIndex f(final int n) {
    // This recomputes a lot of quantities that could be cached or
    // incrementally built.  However, this was complicated enough to
    // get working, that I've opted not to do that for now.
    final CycleIndex zn = z(n);
    final CycleIndex[] iz = new CycleIndex[n + 1];
    for (int k = 1; k < iz.length; ++k) {
      iz[k] = iZ2(k);
    }
    final ArrayList<CycleIndex> r = new ArrayList<>();
    for (final MultivariateMonomial t : zn.values()) {
      final int md = t.maxIndex();
      CycleIndex w = new CycleIndex(t.toString());
      for (int j = 1; j <= md; ++j) {
        final Z d = t.get(new Pair<>(MultivariateMonomial.DEFAULT_VARIABLE, j));
        if (d.signum() > 0) {
          w = multiply(w, power(iz[j], d));
        }
      }
      w.multiply(t.getCoefficient());
      r.add(w);
    }

    final CycleIndex ans = new CycleIndex("G");
    for (final CycleIndex w : r) {
      ans.add(w);
    }
    return ans;
  }

  int mN = 0;

  @Override
  public Z next() {
    final CycleIndex ans = f(++mN);
    //System.out.println(ans);
    final Polynomial<Q> gf = ans.applyOnePlusXToTheN();
    //System.out.println(gf);
    return gf.coeff(1 << (mN - 1)).toZ();
  }
}
