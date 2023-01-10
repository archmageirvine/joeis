package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.a006.A006165;

/**
 * A060973 a(2*n+1) = a(n+1)+a(n), a(2*n) = 2*a(n), with a(1)=0 and a(2)=1.
 * @author Sean A. Irvine
 */
public class A060973 extends A006165 {

  @Override
  public Z next() {
    return Z.valueOf(size() + 1).subtract(super.next());
  }
}

