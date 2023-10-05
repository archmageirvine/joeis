package irvine.oeis.a029;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A029837 Binary order of n: log_2(n) rounded up to next integer.
 * @author Sean A. Irvine
 */
public class A029837 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(LongUtils.log2(++mN) + ((mN & (mN - 1)) == 0 ? 0 : 1));
  }
}
