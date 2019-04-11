package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047241 Numbers that are congruent to <code>{1, 3} mod 6</code>.
 * @author Sean A. Irvine
 */
public class A047241 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047241() {
    super(new long[] {-1, 1, 1}, new long[] {1, 3, 7});
  }
}
