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

  // todo refactor into GeneralLinearCycleIndex

  /*
    Calculated according to a formula by J.P. Kung as the number of
    matrices in GL(cd, Fq) with a matrix derived from lambda(1)
    supplementary matrices of an irreducible polynomial p, lambda(2)
    There is hyper-accompanying margins of p^2 etc.
    Here d is the degree of the polynomial p, lambda a partition of c (that
    is the highest power of p, which is the characteristic polynomial of a
    matrix divides of which D(p, lambda) is a block), q the power
    of the body.
   */

  /*
  Determines the cycle type of the hypercompanion matrix of p(x)^i, a
  irreducible normalized polynomial of degree d with exponent exp, over
  a body with characteristic p and power q.
   */
  private static MultivariateMonomial hypercompanionCycleType(final int d, final int exp, final int i, final int p, final int q) {
    final int[] e = new int[i];
    e[0] = exp;
    int k = 1;
    for (int j = 1; j < i; ++j) {
      e[j] = e[j - 1];
      if (k < j + 1L) {
        k = k * p;
        e[j] *= p;
      }
    }
    final MultivariateMonomial mm = MultivariateMonomial.create(1, Z.ONE);
    final Z t = Z.valueOf(q).pow(d);
    Z t1 = t.subtract(1);
    Z t2 = t1.divide(exp);
    mm.add(exp, t2);
    for (int j = 1; j < i; ++j) {
      t1 = t1.multiply(t);
      t2 = t1.divide(e[j]);
      mm.add(e[j], t2);
    }
    return mm;
  }

  private static MultivariateMonomial hypercompanionCycleTypeAff(final int d, final int exp, final int i, final int p, final int q) {
    int e = 1;
    int hilf = i;
    while (hilf > e) {
      e *= p;
    }
    --hilf;
    Z hilf1 = Z.valueOf(q).pow(hilf);
    Z t2 = hilf1.divide(e);
    final MultivariateMonomial mm = MultivariateMonomial.create(e, t2);
    --hilf;
    hilf1 = Z.valueOf(q).pow(hilf);
    hilf = q - 1;
    hilf1 = hilf1.multiply(hilf);
    mm.setCoefficient(hilf1);
    return mm;
  }

  private static GeneralLinearCycleIndex.CycleTypeInterface AG_CYCLE_TYPE = (d, exp, mu, p, q) -> {
    CycleIndex res = CycleIndex.ONE.copy();
    res.setName("");
    if (d != 1 || (q != 2 && exp != 1)) {
      for (int i = 1; i < mu.length; ++i) {
        if (mu[i] != 0) {
          final MultivariateMonomial hct = hypercompanionCycleType(d, exp, i, p, q);
          hct.setCoefficient(Z.valueOf(q).pow(d * i));
          final CycleIndex hilf1 = new CycleIndex("", hct).pow(HararyMultiply.OP, mu[i], Integer.MAX_VALUE);
          res = res.op(HararyMultiply.OP, hilf1);
        }
      }
    } else {
      for (int i = 1; i < mu.length; ++i) {
        if (mu[i] != 0) {
          final MultivariateMonomial hct = hypercompanionCycleType(d, exp, i, p, q);
          hct.setCoefficient(Z.valueOf(q).pow(i - 1));
          final CycleIndex t = new CycleIndex("", hct);
          final MultivariateMonomial hctAff = hypercompanionCycleTypeAff(d, exp, i + 1, p, q);
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
