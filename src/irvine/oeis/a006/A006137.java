package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A006137 a(n) = 1 + n/2 + 9*n^2/2.
 * @author Sean A. Irvine
 */
public class A006137 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN).multiply(9).add(1).multiply(mN).add(2).divide2();
  }
}
