package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence0;

/**
 * A077267 Number of zeros in base-3 expansion of n.
 * @author Sean A. Irvine
 */
public class A077267 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(ZUtils.digitCounts(++mN, 3)[0]);
  }
}
