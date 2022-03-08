package irvine.oeis.a055;

import irvine.math.z.Z;

/**
 * A055028 Number of Gaussian primes of norm n.
 * @author Sean A. Irvine
 */
public class A055028 extends A055029 {

  @Override
  public Z next() {
    return super.next().multiply(4);
  }
}
