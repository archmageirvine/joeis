package irvine.oeis.a001;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A001604 Odd-indexed terms of A124297.
 * @author Sean A. Irvine
 */
public class A001604 extends Sequence0 {

  /* Compute (a+b*sqrt(5))^n as res[0] + res[1] * sqrt(5). */
  static Z[] sqrt5binomial(final long a, final long b, final int n) {
    Z ra = Z.ZERO;
    Z rb = Z.ZERO;
    Z ak = Z.valueOf(a).pow(n);
    Z bk = Z.ONE;
    Z fk = Z.ONE;
    for (long k = 0; k <= n; ++k) {
      final Z c = Binomial.binomial(n, k).multiply(ak).multiply(bk).multiply(fk);
      if ((k & 1) == 0) {
        ra = ra.add(c);
      } else {
        rb = rb.add(c);
        fk = fk.multiply(5);
      }
      bk = bk.multiply(b);
      ak = ak.divide(a);
    }
    return new Z[] {ra, rb};
  }

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    // 5*(3+sqrt(5))^n
    final Z[] t0 = sqrt5binomial(3, 1, mN);
    Z sum = t0[0].multiply(5);
    //Z xx = t1[0].multiply(5);
    // +sqrt(5)*(3+sqrt(5))^n
    final Z[] t1 = sqrt5binomial(3, 1, mN);
    sum = sum.add(t1[1].multiply(5));
    //xx = xx.add(t1[0]);
    // +5*(3-sqrt(5))^n
    final Z[] t2 = sqrt5binomial(3, -1, mN);
    sum = sum.add(t2[0].multiply(5));
    //xx = xx.add(t2[1].multiply(5));
    // -sqrt(5)*(3-sqrt(5))^n
    sum = sum.subtract(t2[1].multiply(5));
    //xx = xx.subtract(t2[0]);
    // +3*(7+3*sqrt(5))^n
    final Z[] t3 = sqrt5binomial(7, 3, mN);
    sum = sum.add(t3[0].multiply(3));
    //xx = xx.add(t3[1].multiply(3));
    // +sqrt(5)*(7+3*sqrt(5))^n
    sum = sum.add(t3[1].multiply(5));
    //xx = xx.add(t3[0]);
    // +3*(7-3*sqrt(5))^n
    final Z[] t4 = sqrt5binomial(7, -3, mN);
    sum = sum.add(t4[0].multiply(3));
    //xx = xx.add(t4[1].multiply(3));
    // -sqrt(5)*(7-3*sqrt(5))^n
    sum = sum.subtract(t4[1].multiply(5));
    //xx = xx.subtract(t4[0]);
    // xx should be zero
    // +6*2^n
    sum = sum.add(Z.SIX.shiftLeft(mN));
    return sum.shiftRight(mN + 1);
  }
}
