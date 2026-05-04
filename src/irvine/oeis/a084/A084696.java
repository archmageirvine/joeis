package irvine.oeis.a084;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A084696 Beginning with 3, primes such that a(2n) = {a(2n-1) +a(2n+1)}/2.
 * @author Sean A. Irvine
 */
public class A084696 extends Sequence1 {

  private Z mA = null;
  private Z mB = null;
  private boolean mEven = false;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.THREE;
      return Z.THREE;
    }
    mEven = !mEven;
    if (mEven) {
      if (Z.THREE.equals(mA)) {
        mA = Z.FIVE;
        mB = Z.SEVEN;
        return mA;
      }
      long k = 0;
      do {
        k += 6;
      } while (!mB.add(k).isProbablePrime() || !mB.add(2 * k).isProbablePrime());
      mA = mB.add(k);
      mB = mA.add(k);
      return mA;
    } else {
      return mB;
    }
  }
}
