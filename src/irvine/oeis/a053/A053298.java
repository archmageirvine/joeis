package irvine.oeis.a053;

import irvine.oeis.LinearRecurrence;

/**
 * A053298.
 * @author Sean A. Irvine
 */
public class A053298 extends LinearRecurrence {

  /** Construct the sequence. */
  public A053298() {
    super(new long[] {-1, 4, -4, -5, 15, -14, 6}, new long[] {1, 8, 34, 107, 281, 654, 1397});
  }
}
