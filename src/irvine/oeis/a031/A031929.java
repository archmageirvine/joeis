package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031929 Upper prime of a difference of 10 between consecutive primes.
 * @author Sean A. Irvine
 */
public class A031929 extends A031928 {

  {
    setOffset(0);
  }

  @Override
  public Z next() {
    return super.next().add(10);
  }
}
