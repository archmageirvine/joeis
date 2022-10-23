package irvine.oeis.a015;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A015234 a(n) = (17 - 2*n)*n^2.
 * @author Sean A. Irvine
 */
public class A015234 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(17 - 2 * ++mN).multiply(mN).multiply(mN);
  }
}
