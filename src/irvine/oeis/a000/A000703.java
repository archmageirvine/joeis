package irvine.oeis.a000;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A000703 Chromatic number (or Heawood number) of nonorientable surface with n crosscaps.
 * @author Sean A. Irvine
 */
public class A000703 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf((7 + LongUtils.sqrt(1 + 24 * ++mN)) / 2);
  }
}
