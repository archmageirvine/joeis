package irvine.oeis.a031;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A031996 Nondecreasing base 12 digits.
 * @author Sean A. Irvine
 */
public class A031996 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    if (mN == -1) {
      mN = 0;
    } else {
      int g = 0;
      while ((mN % 12) == 11) {
        ++g;
        mN /= 12;
      }
      ++mN;
      final long last = mN % 12;
      while (g-- > 0) {
        mN *= 12;
        mN += last;
      }
    }
    return Z.valueOf(mN);
  }
}
