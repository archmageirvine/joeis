package irvine.oeis.a000;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000703.
 * @author Sean A. Irvine
 */
public class A000703 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf((7 + LongUtils.sqrt(1 + 24 * ++mN)) / 2);
  }
}
