package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.a030.A030527;

/**
 * A046088 Row sums of convolution triangle A030527.
 * @author Sean A. Irvine
 */
public class A046088 extends A030527 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 0; k < mN; ++k) {
      sum = sum.add(super.next());
    }
    return sum;
  }
}
