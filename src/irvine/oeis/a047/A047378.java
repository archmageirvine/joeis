package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047378 Numbers that are congruent to <code>{2, 4, 5} mod 7</code>.
 * @author Sean A. Irvine
 */
public class A047378 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047378() {
    super(new long[] {-1, 1, 0, 1}, new long[] {2, 4, 5, 9});
  }
}
