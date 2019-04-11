package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047285 Numbers that are congruent to <code>{0, 2, 3, 6} mod 7</code>.
 * @author Sean A. Irvine
 */
public class A047285 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047285() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {0, 2, 3, 6, 7});
  }
}
