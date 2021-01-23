package irvine.oeis.a119;

import irvine.oeis.LinearRecurrence;

/**
 * A119336 Expansion of (1-x)^4/((1-x)^6 - x^6).
 * @author Sean A. Irvine
 */
public class A119336 extends LinearRecurrence {

  /** Construct the sequence. */
  public A119336() {
    super(new long[] {6, -15, 20, -15, 6}, new long[] {1, 2, 3, 4, 5});
  }
}
