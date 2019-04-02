package irvine.oeis.a057;

import irvine.oeis.LinearRecurrence;

/**
 * A057540 Birthday set of order 8: i.e., numbers congruent to +- 1 modulo 2, 3, 4, 5, 6, 7 and 8.
 * @author Sean A. Irvine
 */
public class A057540 extends LinearRecurrence {

  /** Construct the sequence. */
  public A057540() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1}, new long[] {1, 41, 71, 169, 209, 239, 281, 391, 449, 559, 601, 631, 671, 769, 799, 839, 841});
  }
}
