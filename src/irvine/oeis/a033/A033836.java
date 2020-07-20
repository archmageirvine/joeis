package irvine.oeis.a033;

import irvine.oeis.a003.A003321;

/**
 * A033836 Smallest number <code>&gt; 1</code> equal to sum of n-th powers of its base 4 digits, or 0 if no such number (written in base <code>10)</code>.
 * @author Sean A. Irvine
 */
public class A033836 extends A003321 {

  @Override
  protected int base() {
    return 4;
  }
}
