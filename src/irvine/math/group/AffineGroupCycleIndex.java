package irvine.math.group;

import irvine.math.api.Ring;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.HararyMultiply;
import irvine.math.polynomial.MultivariateMonomial;
import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * Cycle index for affine group from precomputed data.
 * @author Sean A. Irvine
 */
public final class AffineGroupCycleIndex {

  private AffineGroupCycleIndex() {
  }

  private static MultivariateMonomial hypercompanionCycleTypeAff(final int i, final int p, final int q) {
    int e = 1;
    while (i > e) {
      e *= p;
    }
    return MultivariateMonomial.create(e, Z.valueOf(q).pow(i - 1).divide(e), new Q(Z.valueOf(q).pow(i - 2).multiply(q - 1)));
  }

  private static final GeneralLinearCycleIndex.CycleTypeInterface AG_CYCLE_TYPE = (d, exp, mu, p, q) -> {
    CycleIndex res = CycleIndex.ONE.copy();
    res.setName("");
    if (d != 1 || (q != 2 && exp != 1)) {
      for (int i = 1; i < mu.length; ++i) {
        if (mu[i] != 0) {
          final MultivariateMonomial hct = GeneralLinearCycleIndex.hypercompanionCycleType(d, exp, i, p, q);
          hct.setCoefficient(Z.valueOf(q).pow(d * i));
          final CycleIndex hilf1 = new CycleIndex("", hct).pow(HararyMultiply.OP, mu[i], Integer.MAX_VALUE);
          res = res.op(HararyMultiply.OP, hilf1);
        }
      }
    } else {
      for (int i = 1; i < mu.length; ++i) {
        if (mu[i] != 0) {
          final MultivariateMonomial hct = GeneralLinearCycleIndex.hypercompanionCycleType(d, exp, i, p, q);
          hct.setCoefficient(Z.valueOf(q).pow(i - 1));
          final CycleIndex t = new CycleIndex("", hct);
          final MultivariateMonomial hctAff = hypercompanionCycleTypeAff(i + 1, p, q);
          t.add(hctAff);
          final CycleIndex hilf1 = t.pow(HararyMultiply.OP, mu[i], Integer.MAX_VALUE);
          res = res.op(HararyMultiply.OP, hilf1);
        }
      }
    }
    res.multiply(new Q(Z.ONE, GeneralLinearCycleIndex.kung(d, mu, q)));
    return res;
  };

  /**
   * Construct the cycle index for <code>AG(k,fld)</code>
   * @param k order
   * @param fld field
   * @return cycle index
   */
  public static CycleIndex cycleIndex(final int k, final Ring<?> fld) {
    final CycleIndex res = GeneralLinearCycleIndex.cycleIndex(k, fld, AG_CYCLE_TYPE);
    final int q = fld.size().intValueExact();
    res.multiply(new Q(Z.ONE, Z.valueOf(q).pow(k)));
    return res;
  }

  /**
   * Return the cycle index of <code>AG_n(Z_2)</code>.
   * @param n index
   * @return cycle index
   */
  public static CycleIndex cycleIndex(final int n) {
    return cycleIndex(n, new GaloisField(2));
  }

  /**
   * Print cycle index.
   * @param args cycle index to print.
   */
  public static void main(final String[] args) {
    System.out.println(cycleIndex(Integer.parseInt(args[0]), new GaloisField(args.length <= 1 ? 2 : Integer.parseInt(args[1]))));
  }
}
