package irvine.oeis.a033;

import irvine.oeis.a003.A003321;

/**
 * A033835 Smallest number &gt; 1 equal to sum of n-th powers of its base 3 digits, or 0 if no such number (written in base 10).
 * @author Sean A. Irvine
 */
public class A033835 extends A003321 {

  @Override
  protected int base() {
    return 3;
  }
}
