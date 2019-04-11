package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047562 Numbers that are congruent to <code>{3, 4, 5, 6, 7} mod 8</code>.
 * @author Sean A. Irvine
 */
public class A047562 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047562() {
    super(new long[] {-1, 1, 0, 0, 0, 1}, new long[] {3, 4, 5, 6, 7, 11});
  }
}
