package irvine.oeis.a055;

import irvine.math.z.Z;

/**
 * A055667 Number of Eisenstein-Jacobi primes of norm n.
 * @author Sean A. Irvine
 */
public class A055667 extends A055668 {

  {
    setOffset(0);
  }

  @Override
  public Z next() {
    return super.next().multiply(6);
  }
}
