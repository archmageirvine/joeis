package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047349 Numbers that are congruent to <code>{0, 2, 4} mod 7</code>.
 * @author Sean A. Irvine
 */
public class A047349 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047349() {
    super(new long[] {-1, 1, 0, 1}, new long[] {0, 2, 4, 7});
  }
}
