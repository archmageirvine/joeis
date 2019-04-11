package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047354 Numbers that are congruent to <code>{0, 1, 2} mod 7</code>.
 * @author Sean A. Irvine
 */
public class A047354 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047354() {
    super(new long[] {-1, 1, 0, 1}, new long[] {0, 1, 2, 7});
  }
}
