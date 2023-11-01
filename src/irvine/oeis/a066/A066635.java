package irvine.oeis.a066;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066635 Distance from n to closest square different from n.
 * @author Sean A. Irvine
 */
public class A066635 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final long s = LongUtils.sqrt(++mN);
    if (s * s == mN) {
      return Z.valueOf(mN - (s - 1) * (s - 1));
    }
    return Z.valueOf(Math.min(mN - s * s, (s + 1) * (s + 1) - mN));
  }
}
