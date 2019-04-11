package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047230 Numbers that are congruent to <code>{3, 4} mod 6</code>.
 * @author Sean A. Irvine
 */
public class A047230 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047230() {
    super(new long[] {-1, 1, 1}, new long[] {3, 4, 9});
  }
}
