package irvine.oeis.a007;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007569.
 * @author Sean A. Irvine
 */
public class A007569 implements Sequence {

  // After T. D. Noe

  protected long mN = 0;

  private boolean del(final long m, final long n) {
    return n % m == 0;
  }

  @Override
  public Z next() {
    if (++mN < 4) {
      return Z.valueOf(mN);
    }
    Z a = Binomial.binomial(mN, 4).add(mN);
    if (del(2, mN)) {
      a = a.add(Z.FIVE.negate().multiply(mN).add(45).multiply(mN).subtract(70).multiply(mN).add(24).divide(24));
    }
    if (del(4, mN)) {
      a = a.subtract(3 * mN / 2);
    }
    if (del(6, mN)) {
      a = a.add(Z.valueOf(-45).multiply(mN).add(262).multiply(mN).divide(6));
    }
    if (del(12, mN)) {
      a = a.add(42 * mN);
    }
    if (del(18, mN)) {
      a = a.add(60 * mN);
    }
    if (del(24, mN)) {
      a = a.add(35 * mN);
    }
    if (del(30, mN)) {
      a = a.subtract(38 * mN);
    }
    if (del(42, mN)) {
      a = a.subtract(82 * mN);
    }
    if (del(60, mN)) {
      a = a.subtract(330 * mN);
    }
    if (del(84, mN)) {
      a = a.subtract(144 * mN);
    }
    if (del(90, mN)) {
      a = a.subtract(96 * mN);
    }
    if (del(120, mN)) {
      a = a.subtract(144 * mN);
    }
    if (del(210, mN)) {
      a = a.subtract(96 * mN);
    }
    return a;
  }
}
