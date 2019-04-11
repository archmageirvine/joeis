package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004064 Numbers n such that <code>(12^n - 1)/11</code> is prime.
 * @author Sean A. Irvine
 */
public class A004064 implements Sequence {

  private Z mTwelves = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      mTwelves = mTwelves.multiply(12);
      if (mTwelves.subtract(1).divide(11).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
