package irvine.oeis.a178;

import irvine.oeis.LinearRecurrence;

/**
 * A178945.
 * @author Sean A. Irvine
 */
public class A178945 extends LinearRecurrence {

  /** Construct the sequence. */
  public A178945() {
    super(new long[] {8, -8, -2, 4}, new long[] {1, 2, 7, 16});
  }
}
