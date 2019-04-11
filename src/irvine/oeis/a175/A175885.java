package irvine.oeis.a175;

import irvine.oeis.LinearRecurrence;

/**
 * A175885 Numbers that are congruent to <code>{1, 10} mod 11</code>.
 * @author Sean A. Irvine
 */
public class A175885 extends LinearRecurrence {

  /** Construct the sequence. */
  public A175885() {
    super(new long[] {-1, 1, 1}, new long[] {1, 10, 12});
  }
}
