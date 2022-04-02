package irvine.oeis.a055;

import irvine.math.z.Z;

/**
 * A055665 Number of Eisenstein-Jacobi primes of successive norms (indexed by A055664).
 * @author Sean A. Irvine
 */
public class A055665 extends A055666 {

  @Override
  public Z next() {
    return super.next().multiply(6);
  }
}
