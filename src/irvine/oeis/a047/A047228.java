package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047228 Numbers that are congruent to <code>{2, 3, 4} mod 6</code>.
 * @author Sean A. Irvine
 */
public class A047228 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047228() {
    super(new long[] {-1, 1, 0, 1}, new long[] {2, 3, 4, 8});
  }
}
