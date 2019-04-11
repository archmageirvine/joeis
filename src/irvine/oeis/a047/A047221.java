package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047221 Numbers that are congruent to <code>{2, 3} mod 5</code>.
 * @author Sean A. Irvine
 */
public class A047221 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047221() {
    super(new long[] {-1, 1, 1}, new long[] {2, 3, 7});
  }
}
