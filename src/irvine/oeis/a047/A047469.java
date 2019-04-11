package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047469 Numbers that are congruent to <code>{0, 1, 2} mod 8</code>.
 * @author Sean A. Irvine
 */
public class A047469 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047469() {
    super(new long[] {-1, 1, 0, 1}, new long[] {0, 1, 2, 8});
  }
}
