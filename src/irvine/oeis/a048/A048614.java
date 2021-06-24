package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.a027.A027833;

/**
 * A048614 Number of primes between successive pairs of twin primes.
 * @author Sean A. Irvine
 */
public class A048614 extends A027833 {

  @Override
  public Z next() {
    return super.next().subtract(2).max(Z.ZERO);
  }
}

