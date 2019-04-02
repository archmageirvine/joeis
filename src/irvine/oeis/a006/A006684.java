package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;
import irvine.oeis.a000.A000129;

/**
 * A006684 Convolve Fibonacci and Pell numbers.
 * @author Sean A. Irvine
 */
public class A006684 extends A000129 {

  private final A000045 mFibo = new A000045();

  @Override
  public Z next() {
    return super.next().subtract(mFibo.next());
  }
}
