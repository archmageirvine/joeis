package irvine.oeis.a086;

import irvine.math.z.Z;
import irvine.oeis.a085.A085956;

/**
 * A086362 a(n) = A085956(3n+1).
 * @author Sean A. Irvine
 */
public class A086362 extends A085956 {

  @Override
  public Z next() {
    final Z t = super.next();
    super.next();
    super.next();
    return t;
  }
}
