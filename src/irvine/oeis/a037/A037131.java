package irvine.oeis.a037;

import irvine.math.z.Z;

/**
 * A037131 a(n) = (nextprime(4^n) - nextprime(2^n))/2.
 * @author Sean A. Irvine
 */
public class A037131 extends A037130 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
