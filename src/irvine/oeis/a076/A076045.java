package irvine.oeis.a076;

import irvine.math.z.Z;

/**
 * A076045 Primes that are three term sums of A076990.
 * @author Sean A. Irvine
 */
public class A076045 extends A076990 {

  {
    super.next();
    super.next();
  }

  @Override
  protected Z select(final Z a, final Z b, final Z c) {
    return a.add(b).add(c);
  }
}
