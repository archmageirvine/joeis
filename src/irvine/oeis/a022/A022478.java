package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.oeis.a006.A006711;

/**
 * A022478 Number of 2's in n-th term of A006711.
 * @author Sean A. Irvine
 */
public class A022478 extends A006711 {

  @Override
  public Z next() {
    return Z.valueOf(A022477.count(super.next(), Z.TWO));
  }
}
