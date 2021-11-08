package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.a054.A054120;

/**
 * A052392 T(2n+1,n), array T as in A054120.
 * @author Sean A. Irvine
 */
public class A052392 extends A054120 {

  private long mN = -1;

  @Override
  public Z next() {
    return get(2 * ++mN + 1, mN);
  }
}
