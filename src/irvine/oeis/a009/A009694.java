package irvine.oeis.a009;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A009694.
 * @author Sean A. Irvine
 */
public class A009694 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN / 8)
      .multiply((mN + 1) / 8)
      .multiply((mN + 2) / 8)
      .multiply((mN + 3) / 8)
      .multiply((mN + 4) / 8)
      .multiply((mN + 5) / 8)
      .multiply((mN + 6) / 8)
      .multiply((mN + 7) / 8);
  }
}
