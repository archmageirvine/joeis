package irvine.oeis.a015;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A015247 a(n) = (2*n - 15)*n^2.
 * @author Sean A. Irvine
 */
public class A015247 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(2 * ++mN - 15).multiply(mN).multiply(mN);
  }
}
