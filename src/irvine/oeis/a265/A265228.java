package irvine.oeis.a265;

import irvine.oeis.LinearRecurrence;

/**
 * A265228 Interleave the even numbers with the numbers that are congruent to <code>{1, 3, 7} mod 8</code>.
 * @author Sean A. Irvine
 */
public class A265228 extends LinearRecurrence {

  /** Construct the sequence. */
  public A265228() {
    super(new long[] {-1, 0, 1, 0, 0, 0, 1, 0}, new long[] {0, 1, 2, 3, 4, 7, 6, 9});
  }
}
