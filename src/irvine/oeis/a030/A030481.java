package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030481 Squares of primes, with property that all even digits occur together and all odd digits occur together.
 * @author Sean A. Irvine
 */
public class A030481 extends A030480 {

  {
    setOffset(0);
  }

  @Override
  public Z next() {
    return super.next().square();
  }
}
