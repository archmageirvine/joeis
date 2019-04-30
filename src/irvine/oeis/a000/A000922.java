package irvine.oeis.a000;

import irvine.math.cr.CR;

/**
 * A000922 Primes p of the form <code>3k+1</code> such that -sqrt(p) <code>&lt; sum_{x=1</code>..p} cos(2*Pi*x^3/p) &lt; sqrt(p).
 * @author Sean A. Irvine
 */
public class A000922 extends A000921 {

  @Override
  protected boolean compare(final CR s, final CR p) {
    return s.multiply(s).compareTo(p) <= 0;
  }
}
