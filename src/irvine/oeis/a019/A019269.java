package irvine.oeis.a019;

import irvine.math.z.Z;

/**
 * A019269 Let Dedekind's psi(m) = product of (p+1)p^(e-1) for primes p, where p^e is a factor of m. Iterating psi(m) eventually results in a number of form 2^a*3^b. <code>a(n)</code> is the number of steps to reach such a number.
 * @author Sean A. Irvine
 */
public class A019269 extends A019268 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(count(++mN));
  }
}
