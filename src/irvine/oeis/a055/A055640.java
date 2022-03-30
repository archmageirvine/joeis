package irvine.oeis.a055;

import irvine.math.IntegerUtils;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A055640 Number of nonzero digits in decimal expansion of n.
 * @author Sean A. Irvine
 */
public class A055640 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    final int[] cnts = ZUtils.digitCounts(++mN);
    cnts[0] = 0;
    return Z.valueOf(IntegerUtils.sum(cnts));
  }
}

