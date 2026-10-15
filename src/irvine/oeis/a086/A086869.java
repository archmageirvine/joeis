package irvine.oeis.a086;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.a070.A070751;

/**
 * A086869 a(n) = floor(abs(1/sin(A070751(n)))).
 * @author Sean A. Irvine
 */
public class A086869 extends A070751 {

  @Override
  public Z next() {
    return CR.valueOf(super.next()).sin().inverse().abs().floor();
  }
}

