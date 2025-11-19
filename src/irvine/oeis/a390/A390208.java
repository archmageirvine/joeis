package irvine.oeis.a390;

/**
 * A390208 Number of integer partitions of n with parts colored by {0, 1, 2} such that the sum of colors is congruent to 1 (mod 3).
 * @author Sean A. Irvine
 */
public class A390208 extends A390217 {

  /** Construct the sequence. */
  public A390208() {
    super(3);
  }

  protected boolean accept(final int sum) {
    return (sum % mColours) == 1;
  }
}
