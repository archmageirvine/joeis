package irvine.oeis.a007;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007173.
 * @author Sean A. Irvine
 */
public class A007173 implements Sequence {

  // After Robert A. Russell

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final Z b = Z.valueOf(2 * mN + 1).multiply(2 * mN + 2);
    Z a = Binomial.binomial(3 * mN, mN).multiply(mN + 1).multiply2();
    if ((mN & 1) == 0) {
      a = a.add(Binomial.binomial(3 * mN / 2, mN).multiply(3).multiply(b));
    } else {
      a = a.add(Binomial.binomial(3 * (mN - 1) / 2 + 1, mN).multiply(3).multiply(b));
    }
    final long r = mN % 3;
    if (r != 0) {
      a = a.add(Binomial.binomial(mN, (mN - r) / 3).multiply(mN + 1).multiply(4).multiply(b).divide(mN));
    }
    return a.divide(6).divide(mN + 1).divide(b);
  }
}
