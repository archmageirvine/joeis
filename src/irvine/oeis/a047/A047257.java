package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047257 Numbers that are congruent to <code>{4, 5} mod 6</code>.
 * @author Sean A. Irvine
 */
public class A047257 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047257() {
    super(new long[] {-1, 1, 1}, new long[] {4, 5, 10});
  }
}
