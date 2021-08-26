package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.a048.A048141;

/**
 * A051061 a(n) = A048141(3*n).
 * @author Sean A. Irvine
 */
public class A051061 extends A048141 {

  @Override
  public Z next() {
    super.next();
    super.next();
    return super.next();
  }
}
