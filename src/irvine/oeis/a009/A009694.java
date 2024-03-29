package irvine.oeis.a009;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A009694 a(n) = Product_{i=0..7} floor((n+i)/8).
 * @author Sean A. Irvine
 */
public class A009694 extends Sequence0 {

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
