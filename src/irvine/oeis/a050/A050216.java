package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A050216.
 * @author Sean A. Irvine
 */
public class A050216 extends A000040 {

  private Z mHi = Z.ZERO;

  @Override
  public Z next() {
    final Z lo = mHi;
    mHi = super.next().square();
    long cnt = 0;
    for (Z p = mFast.nextPrime(lo); p.compareTo(mHi) < 0; p = mFast.nextPrime(p), ++cnt) {
      // do nothing
    }
    return Z.valueOf(cnt);
  }
}
