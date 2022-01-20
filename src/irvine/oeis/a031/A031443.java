package irvine.oeis.a031;

import irvine.oeis.a049.A049354;

/**
 * A031443 Digitally balanced numbers: positive numbers that in base 2 have the same number of 0's as 1's.
 * @author Sean A. Irvine
 */
public class A031443 extends A049354 {

  @Override
  protected int base() {
    return 2;
  }
}
