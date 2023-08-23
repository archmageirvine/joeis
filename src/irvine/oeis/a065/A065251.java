package irvine.oeis.a065;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065251 Simple quasi-periodic sequence consisting of the terms 1, 0 and -1.
 * @author Sean A. Irvine
 */
public class A065251 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(1 - (++mN - (1L << LongUtils.lg(mN))) % 3);
  }
}
