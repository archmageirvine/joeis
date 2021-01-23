package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A005097 (Odd primes - 1)/2.
 * @author Sean A. Irvine
 */
public class A005097 extends A000040 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().divide2();
  }
}

