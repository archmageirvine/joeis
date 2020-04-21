package irvine.oeis.a031;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A031215 <code>a(n) = prime(2n)</code>.
 * @author Sean A. Irvine
 */
public class A031215 extends A000040 {

  @Override
  public Z next() {
    super.next();
    return super.next();
  }
}
