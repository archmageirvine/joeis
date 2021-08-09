package irvine.oeis.a031;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A031338 a(n) = prime(5*n).
 * @author Sean A. Irvine
 */
public class A031338 extends A000040 {

  @Override
  public Z next() {
    super.next();
    super.next();
    super.next();
    super.next();
    return super.next();
  }
}

