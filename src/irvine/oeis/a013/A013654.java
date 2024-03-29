package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A013654 Positive nonsquare integers k such that each term of the regular continued fraction of sqrt(k) divides k.
 * @author Sean A. Irvine
 */
public class A013654 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(++mN).multiply((mN & 1) == 0 ? mN + 2 : mN + 1);
  }
}
