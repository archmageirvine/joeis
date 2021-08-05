package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.a065.A065091;

/**
 * A005097 (Odd primes - 1)/2.
 * @author Sean A. Irvine
 */
public class A005097 extends A065091 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}

