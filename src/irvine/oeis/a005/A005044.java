package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005044.
 * @author Sean A. Irvine
 */
public class A005044 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).square().add(6).divide(12).subtract(Z.valueOf(mN / 4).multiply((mN + 2) / 4));
  }
}
