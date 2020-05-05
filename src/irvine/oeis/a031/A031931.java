package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031931 Upper prime of a difference of 12 between consecutive primes.
 * @author Sean A. Irvine
 */
public class A031931 extends A031930 {

  @Override
  public Z next() {
    return super.next().add(12);
  }
}
