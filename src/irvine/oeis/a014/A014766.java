package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014766 3n shuffle group does not accomplish a perfect shuffle.
 * @author Sean A. Irvine
 */
public class A014766 implements Sequence {

  // Conjecture

  private long mN = 6;
  private long mT = 9;

  @Override
  public Z next() {
    while (true) {
      mN += 3;
      if (mN == mT) {
        mT *= 3;
        return Z.valueOf(mN);
      }
      if (mN % 12 == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
