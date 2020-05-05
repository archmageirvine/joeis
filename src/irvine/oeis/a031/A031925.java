package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031925 Upper prime of a difference of 6 between consecutive primes.
 * @author Sean A. Irvine
 */
public class A031925 extends A031924 {

  @Override
  public Z next() {
    return super.next().add(6);
  }
}
