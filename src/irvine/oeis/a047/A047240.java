package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047240 Numbers that are congruent to <code>{0, 1, 2} mod 6</code>.
 * @author Sean A. Irvine
 */
public class A047240 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047240() {
    super(new long[] {-1, 1, 0, 1}, new long[] {0, 1, 2, 6});
  }
}
