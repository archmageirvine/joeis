package irvine.oeis.a065;

import irvine.math.z.Z;

/**
 * A065397 Primes which have no representation p + k*(k+1) / 2, with p prime and k &gt; 0: A000040-Complement of A065396.
 * @author Sean A. Irvine
 */
public class A065397 extends A065396 {

  @Override
  protected boolean is(final Z p) {
    return !super.is(p);
  }
}
