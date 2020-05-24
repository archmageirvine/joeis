package irvine.oeis.a031;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A031921 <code>a(n) = prime(100*n)</code>.
 * @author Sean A. Irvine
 */
public class A031921 extends A000040 {

  @Override
  public Z next() {
    for (int k = 0; k < 99; ++k) {
      super.next();
    }
    return super.next();
  }
}
