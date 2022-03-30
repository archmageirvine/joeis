package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A055641 Number of zero digits in n.
 * @author Sean A. Irvine
 */
public class A055641 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(ZUtils.digitCounts(++mN)[0]);
  }
}

