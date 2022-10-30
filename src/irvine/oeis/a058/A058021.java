package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.a051.A051451;

/**
 * A058021 Largest prime preceding distinct values of lcm(1,...,m): Max{p|p &lt; A003418(A000961(n))}. To get different LCM values, the last arguments(m) of LCM were selected from A000961.
 * @author Sean A. Irvine
 */
public class A058021 extends A051451 {

  {
    setOffset(0);
  }

  @Override
  public Z next() {
    final Z t = mPrime.prevPrime(super.next());
    return t.isZero() ? Z.valueOf(-2) : t;
  }
}
