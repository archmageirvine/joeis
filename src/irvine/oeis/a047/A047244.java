package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047244 Numbers that are congruent to <code>{0, 2, 3} mod 6</code>.
 * @author Sean A. Irvine
 */
public class A047244 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047244() {
    super(new long[] {-1, 1, 0, 1}, new long[] {0, 2, 3, 6});
  }
}
