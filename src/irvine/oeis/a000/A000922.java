package irvine.oeis.a000;

import irvine.math.cr.CR;

/**
 * A000922 Primes p of the form 3k+1 such that -sqrt(p) &lt; sum_{x=1..p} cos(2*Pi*x^3/p) &lt; sqrt(p).
 * @author Sean A. Irvine
 */
public class A000922 extends A000921 {

  @Override
  protected boolean compare(final CR s, final CR p) {
    return s.multiply(s).compareTo(p) <= 0;
  }
}
