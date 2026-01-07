package irvine.oeis.a392;

import irvine.oeis.a390.A390217;

/**
 * A392002 Number of partitions of n with parts colored by {0, 1} such that the sum of colors is congruent to 1 (mod 2).
 * @author Sean A. Irvine
 */
public class A392002 extends A390217 {

  /** Construct the sequence. */
  public A392002() {
    super(2);
  }

  @Override
  protected boolean accept(final int sum) {
    return (sum % mColours) == 1;
  }
}
