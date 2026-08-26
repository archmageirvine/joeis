package irvine.oeis.a086;

import irvine.math.z.Z;
import irvine.oeis.a085.A085956;

/**
 * A086361 a(n)=A085956(3n).
 * @author Sean A. Irvine
 */
public class A086361 extends A085956 {

  @Override
  public Z next() {
    super.next();
    super.next();
    return super.next();
  }
}
