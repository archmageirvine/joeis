package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047275 Numbers that are congruent to <code>{0, 1, 6} mod 7</code>.
 * @author Sean A. Irvine
 */
public class A047275 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047275() {
    super(new long[] {-1, 1, 0, 1}, new long[] {0, 1, 6, 7});
  }
}
