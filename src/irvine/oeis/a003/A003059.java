package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003059 k appears 2k-1 times. Also, square root of <code>n,</code> rounded up.
 * @author Sean A. Irvine
 */
public class A003059 implements Sequence {

  private long mN = 0;
  private long mC = 0;

  @Override
  public Z next() {
    if (++mC >= 2 * mN - 1) {
      ++mN;
      mC = 0;
    }
    return Z.valueOf(mN);
  }
}
