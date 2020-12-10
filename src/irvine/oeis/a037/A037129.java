package irvine.oeis.a037;

import irvine.math.z.Z;

/**
 * A037129 (nextprime(3^n)-nextprime(2^n))/2.
 * @author Sean A. Irvine
 */
public class A037129 extends A037128 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
