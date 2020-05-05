package irvine.oeis.a009;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A009994 Numbers with digits in nondecreasing order.
 * @author Sean A. Irvine
 */
public class A009994 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    if (mN == -1) {
      mN = 0;
    } else {
      int g = 0;
      while ((mN % 10) == 9) {
        ++g;
        mN /= 10;
      }
      ++mN;
      final long last = mN % 10;
      while (g-- > 0) {
        mN *= 10;
        mN += last;
      }
    }
    return Z.valueOf(mN);
  }
}
