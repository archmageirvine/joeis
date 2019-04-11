package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006549 Numbers n such that n and <code>n+1</code> are prime powers.
 * @author Sean A. Irvine
 */
public class A006549 implements Sequence {

  // One of the numbers must be a power of 2
  private Z mA = Z.ONE;
  private boolean mTryBelow = true; // true try 2^k-1, false try 2^k+1

  @Override
  public Z next() {
    while (true) {
      if (mTryBelow) {
        mA = mA.multiply2();
        mTryBelow = false;
        final Z s = mA.subtract(1);
        if (Z.ONE.equals(s) || s.isProbablePrime()) {
          return s;
        }
        final Z power = s.isPower();
        if (power != null && power.isProbablePrime()) {
          return s;
        }
      }
      mTryBelow = true;
      final Z s = mA.add(1);
      if (s.isProbablePrime()) {
        return mA;
      }
      final Z power = s.isPower();
      if (power != null && power.isProbablePrime()) {
        return mA;
      }
    }
  }
}
