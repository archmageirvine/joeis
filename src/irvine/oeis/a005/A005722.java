package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A005722 a(n) = (prime(n) - 1)^2.
 * @author Sean A. Irvine
 */
public class A005722 extends A000040 {

  @Override
  public Z next() {
    return super.next().subtract(1).square();
  }
}

