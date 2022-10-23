package irvine.oeis.a009;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A009641 a(n) = Product_{i=0..6} floor((n+i)/7).
 * @author Sean A. Irvine
 */
public class A009641 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN / 7)
      .multiply((mN + 1) / 7)
      .multiply((mN + 2) / 7)
      .multiply((mN + 3) / 7)
      .multiply((mN + 4) / 7)
      .multiply((mN + 5) / 7)
      .multiply((mN + 6) / 7);
  }
}
