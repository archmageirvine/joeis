package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.a065.A065091;

/**
 * A048974 Odd numbers that are the sum of 2 primes.
 * @author Sean A. Irvine
 */
public class A048974 extends A065091 {

  @Override
  public Z next() {
    return super.next().add(2);
  }
}

