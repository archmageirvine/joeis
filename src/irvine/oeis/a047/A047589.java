package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047589 Numbers that are congruent to <code>{6, 7} mod 8</code>.
 * @author Sean A. Irvine
 */
public class A047589 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047589() {
    super(new long[] {-1, 1, 1}, new long[] {6, 7, 14});
  }
}
