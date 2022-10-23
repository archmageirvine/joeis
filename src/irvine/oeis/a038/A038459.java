package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A038459 A sequence for measuring seconds: read it aloud.
 * @author Sean A. Irvine
 */
public class A038459 extends Sequence1 {

  private static final Z Z1000 = Z.valueOf(1000);
  private long mN = 1;

  @Override
  public Z next() {
    return (++mN & 1) == 0 ? Z.valueOf(mN / 2) : Z1000;
  }
}
