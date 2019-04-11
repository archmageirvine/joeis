package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047571 Numbers that are congruent to <code>{0, 2, 4, 5, 6, 7} mod 8</code>.
 * @author Sean A. Irvine
 */
public class A047571 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047571() {
    super(new long[] {-1, 2, -2, 2, -2, 2}, new long[] {0, 2, 4, 5, 6, 7});
  }
}
