package irvine.oeis.a029;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A029837 Binary order of n: <code>log_2(n)</code> rounded up to next integer.
 * @author Sean A. Irvine
 */
public class A029837 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(LongUtils.lg(++mN) + ((mN & (mN - 1)) == 0 ? 0 : 1));
  }
}
