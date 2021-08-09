package irvine.oeis.a031;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A031340 a(n) = prime(7*n).
 * @author Sean A. Irvine
 */
public class A031340 extends A000040 {

  @Override
  public Z next() {
    for (int k = 0; k < 6; ++k) {
      super.next();
    }
    return super.next();
  }
}

