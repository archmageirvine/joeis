package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A048512 a(n) = T(7,n), array T given by A048505.
 * @author Sean A. Irvine
 */
public class A048512 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN).add(29).multiply(mN).add(196).shiftLeft(mN - 2).subtract(48);
  }
}
