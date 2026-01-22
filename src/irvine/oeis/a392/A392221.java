package irvine.oeis.a392;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A392221 Sum of depths of leaves in a complete binary tree with n nodes.
 * @author Sean A. Irvine
 */
public class A392221 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final long h = LongUtils.log2(++mN);
    return Z.valueOf(mN + 1 - (1L << h) + (h - 1) * ((mN + 1) / 2));
  }
}
