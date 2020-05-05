package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031939 Upper prime of a difference of 20 between consecutive primes.
 * @author Sean A. Irvine
 */
public class A031939 extends A031938 {

  @Override
  public Z next() {
    return super.next().add(20);
  }
}
