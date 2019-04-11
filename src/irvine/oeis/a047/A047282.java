package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047282 Numbers that are congruent to <code>{1, 3, 6} mod 7</code>.
 * @author Sean A. Irvine
 */
public class A047282 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047282() {
    super(new long[] {-1, 1, 0, 1}, new long[] {1, 3, 6, 8});
  }
}
