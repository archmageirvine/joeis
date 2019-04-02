package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003057 n appears n - 1 times.
 * @author Sean A. Irvine
 */
public class A003057 implements Sequence {

  private long mN = 1;
  private long mC = 0;

  @Override
  public Z next() {
    if (++mC >= mN) {
      ++mN;
      mC = 1;
    }
    return Z.valueOf(mN);
  }
}
