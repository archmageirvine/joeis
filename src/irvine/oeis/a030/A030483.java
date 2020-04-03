package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030483 Cubes of primes, with property that all even digits occur together and all odd digits occur together.
 * @author Sean A. Irvine
 */
public class A030483 extends A030482 {

  @Override
  public Z next() {
    return super.next().pow(3);
  }
}
