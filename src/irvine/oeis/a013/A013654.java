package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013654.
 * @author Sean A. Irvine
 */
public class A013654 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(++mN).multiply((mN & 1) == 0 ? mN + 2 : mN + 1);
  }
}
