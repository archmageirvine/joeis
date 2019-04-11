package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047235 Numbers that are congruent to <code>{2, 4} mod 6</code>.
 * @author Sean A. Irvine
 */
public class A047235 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047235() {
    super(new long[] {-1, 1, 1}, new long[] {2, 4, 8});
  }
}
