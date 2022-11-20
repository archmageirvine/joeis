package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.a000.A000796;

/**
 * A060421 Numbers n such that the first n digits of the decimal expansion of Pi form a prime.
 * @author Sean A. Irvine
 */
public class A060421 extends A000796 {

  private Z mA = Z.ZERO;
  private long mCnt = 0;

  @Override
  public Z next() {
    do {
      ++mCnt;
      mA = mA.multiply(10).add(super.next());
    } while (!mA.isProbablePrime());
    return Z.valueOf(mCnt);
  }
}
