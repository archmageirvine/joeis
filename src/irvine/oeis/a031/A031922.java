package irvine.oeis.a031;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A031922 <code>a(n) = prime(1000 * n)</code>.
 * @author Sean A. Irvine
 */
public class A031922 extends A000040 {

  @Override
  public Z next() {
    for (int k = 0; k < 999; ++k) {
      super.next();
    }
    return super.next();
  }
}
