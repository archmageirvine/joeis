package irvine.oeis.a037;

import irvine.math.z.Z;

/**
 * A037133 (nextprime(5^n)-nextprime(2^n))/2.
 * @author Sean A. Irvine
 */
public class A037133 extends A037132 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
