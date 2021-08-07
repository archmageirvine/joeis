package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.a006.A006928;

/**
 * A049710 a(n)=3-k(n), where k=A006928; also, a and k have the same runlength sequence, with n-th term k(n-1) for n &gt;= 2.
 * @author Sean A. Irvine
 */
public class A049710 extends A006928 {

  @Override
  public Z next() {
    return Z.THREE.subtract(super.next());
  }
}
