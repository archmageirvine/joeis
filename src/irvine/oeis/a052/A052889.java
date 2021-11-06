package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.a000.A000110;

/**
 * A052889 Number of rooted set partitions.
 * @author Georg Fischer
 */
public class A052889 extends A000110 {

  protected int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return mN == 0 ? Z.ZERO : super.next().multiply(mN);
  }
}
