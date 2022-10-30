package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031927 Upper prime of a difference of 8 between consecutive primes.
 * @author Sean A. Irvine
 */
public class A031927 extends A031926 {

  {
    setOffset(0);
  }

  @Override
  public Z next() {
    return super.next().add(8);
  }
}
