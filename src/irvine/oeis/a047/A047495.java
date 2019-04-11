package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047495 Numbers that are congruent to <code>{2, 4, 5, 7} mod 8</code>.
 * @author Sean A. Irvine
 */
public class A047495 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047495() {
    super(new long[] {-1, 2, -2, 2}, new long[] {2, 4, 5, 7});
  }
}
