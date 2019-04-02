package irvine.oeis.a000;

import irvine.math.cr.CR;

/**
 * A000923 Primes p of the form 3k+1 such that sum_{x=1..p} cos(2*Pi*x^3/p) &lt; -sqrt(p).
 * @author Sean A. Irvine
 */
public class A000923 extends A000921 {

  @Override
  protected boolean compare(final CR s, final CR p) {
    return s.signum() < 0 && s.multiply(s).compareTo(p) > 0;
  }
}
