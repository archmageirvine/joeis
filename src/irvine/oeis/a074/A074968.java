package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A074934.
 * @author Sean A. Irvine
 */
public class A074968 extends A000040 {

  private long mM = 0;
  private long mQ = 1;
  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    final Z p = super.next();
    if (Z.TWO.equals(p)) {
      return Z.THREE;
    }
    while (mSum.compareTo(p.multiply(mQ)) < 0) {
      ++mM;
      mQ = mPrime.nextPrime(mQ);
      mSum = mSum.add(mQ);
    }
    return Z.valueOf(mM - 1);
  }
}
