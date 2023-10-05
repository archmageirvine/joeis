package irvine.oeis.a063;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063511 a(n) = a(floor(square root(n))) * 2.
 * @author Sean A. Irvine
 */
public class A063511 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return ++mN == 1 ? Z.ONE : Z.TWO.shiftLeft(LongUtils.log2(LongUtils.log2(mN)));
  }
}
