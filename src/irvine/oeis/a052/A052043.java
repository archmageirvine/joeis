package irvine.oeis.a052;

import irvine.math.z.Z;

/**
 * A052043 Squares of primes lacking the digit zero in their decimal expansion.
 * @author Sean A. Irvine
 */
public class A052043 extends A052042 {

  @Override
  public Z next() {
    return super.next().square();
  }
}

