package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031937 Upper prime of a difference of 18 between consecutive primes.
 * @author Sean A. Irvine
 */
public class A031937 extends A031936 {

  @Override
  public Z next() {
    return super.next().add(18);
  }
}
