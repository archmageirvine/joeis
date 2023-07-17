package irvine.oeis.a032;

import irvine.oeis.a001.A001692;

/**
 * A032166 Number of aperiodic necklaces of n beads of 11 colors.
 * @author Sean A. Irvine
 */
public class A032166 extends A001692 {

  /** Construct the sequence. */
  public A032166() {
    super(1);
  }

  {
    next(); // skip 0th
  }

  @Override
  protected int colors() {
    return 11;
  }
}
