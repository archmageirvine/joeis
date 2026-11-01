package irvine.oeis.a087;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A087156 Nonnegative numbers excluding 1.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A087156 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 1) {
      ++mN;
    }
    return Z.valueOf(mN);
  }
}
