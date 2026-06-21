package irvine.oeis.a088;

import irvine.math.z.Z;
import irvine.oeis.a085.A085489;

/**
 * A088809 Number of subsets of {1, ..., n} that are not sum-free.
 * @author Sean A. Irvine
 */
public class A088809 extends A085489 {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.ONE.shiftLeft(++mN).subtract(super.next());
  }
}
