package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031935 Upper prime of a difference of 16 between consecutive primes.
 * @author Sean A. Irvine
 */
public class A031935 extends A031934 {

  {
    setOffset(0);
  }

  @Override
  public Z next() {
    return super.next().add(16);
  }
}
