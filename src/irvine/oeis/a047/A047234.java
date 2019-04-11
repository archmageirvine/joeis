package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047234 Numbers that are congruent to <code>{0, 1, 4} mod 6</code>.
 * @author Sean A. Irvine
 */
public class A047234 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047234() {
    super(new long[] {-1, 1, 0, 1}, new long[] {0, 1, 4, 6});
  }
}
