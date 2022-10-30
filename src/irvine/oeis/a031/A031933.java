package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031933 Upper prime of a difference of 14 between consecutive primes.
 * @author Sean A. Irvine
 */
public class A031933 extends A031932 {

  {
    setOffset(0);
  }

  @Override
  public Z next() {
    return super.next().add(14);
  }
}
