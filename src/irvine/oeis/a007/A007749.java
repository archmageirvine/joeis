package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007749 Numbers k such that k!! - 1 is prime.
 * @author Sean A. Irvine
 */
public class A007749 implements Sequence {

  private long mN = 2;
  private Z mEven = Z.TWO;
  private Z mOdd = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      if ((++mN & 1) == 0) {
        mEven = mEven.multiply(mN);
        if (mEven.subtract(1).isProbablePrime()) {
          return Z.valueOf(mN);
        }
      } else {
        mOdd = mOdd.multiply(mN);
        if (mOdd.subtract(1).isProbablePrime()) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}

