package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.a000.A000189;

/**
 * A048798 Smallest k &gt; 0 such that n*k is a perfect cube.
 * @author Sean A. Irvine
 */
public class A048798 extends A000189 {

  protected long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(++mN).square().divide(super.next().pow(3));
  }
}
