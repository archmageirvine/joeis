package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence0;

/**
 * A055641 Number of zero digits in n.
 * @author Sean A. Irvine
 */
public class A055641 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(ZUtils.digitCounts(++mN)[0]);
  }
}

