package irvine.oeis.a033;

import irvine.oeis.a003.A003321;

/**
 * A033838 Smallest number &gt; 1 equal to sum of n-th powers of its base 6 digits, or 0 if no such number (written in base 10).
 * @author Sean A. Irvine
 */
public class A033838 extends A003321 {

  @Override
  protected int base() {
    return 6;
  }
}
