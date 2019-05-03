package irvine.oeis.a019;

import irvine.math.z.Z;

/**
 * A019269 Let Dedekind's <code>psi(m) =</code> product of <code>(p+1)p^(e-1)</code> for primes p, where <code>p^e</code> is a factor of m. Iterating <code>psi(m)</code> eventually results in a number of form <code>2^a*3^b. a(n)</code> is the number of steps to reach such a number.
 * @author Sean A. Irvine
 */
public class A019269 extends A019268 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(count(++mN));
  }
}
