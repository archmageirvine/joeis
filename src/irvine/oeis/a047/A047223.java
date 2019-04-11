package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047223 Numbers that are congruent to <code>{1, 2, 3} mod 5</code>.
 * @author Sean A. Irvine
 */
public class A047223 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047223() {
    super(new long[] {-1, 1, 0, 1}, new long[] {1, 2, 3, 6});
  }
}
