package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence0;

/**
 * A076707.
 * @author Sean A. Irvine
 */
public class A077267 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(ZUtils.digitCounts(++mN, 3)[0]);
  }
}
