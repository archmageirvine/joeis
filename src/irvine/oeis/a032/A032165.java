package irvine.oeis.a032;

import irvine.oeis.a001.A001692;

/**
 * A032165 Number of aperiodic necklaces of n beads of 10 colors.
 * @author Sean A. Irvine
 */
public class A032165 extends A001692 {

  {
    next(); // skip 0th
  }

  @Override
  protected int colors() {
    return 10;
  }
}
