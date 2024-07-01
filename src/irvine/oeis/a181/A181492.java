package irvine.oeis.a181;

import irvine.math.z.Z;

/**
 * A181492 Primes of the form p=3*2^k+1 such that p-2 is also a prime.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A181492 extends A181491 {

  @Override
  public Z next() {
    return super.next().add(2);
  }
}
