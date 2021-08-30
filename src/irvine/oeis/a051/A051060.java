package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.a048.A048141;

/**
 * A051060 a(n) = A048141(3*n+2).
 * @author Sean A. Irvine
 */
public class A051060 extends A048141 {

  @Override
  public Z next() {
    super.next();
    final Z t = super.next();
    super.next();
    return t;
  }
}
