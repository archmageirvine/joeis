package irvine.oeis.a015;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A015246 a(n) = (2*n - 13)*n^2.
 * @author Sean A. Irvine
 */
public class A015246 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(2 * ++mN - 13).multiply(mN).multiply(mN);
  }
}
