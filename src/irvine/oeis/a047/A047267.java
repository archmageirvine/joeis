package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047267 Numbers that are congruent to <code>{0, 2, 5} mod 6</code>.
 * @author Sean A. Irvine
 */
public class A047267 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047267() {
    super(new long[] {-1, 1, 0, 1}, new long[] {0, 2, 5, 6});
  }
}
