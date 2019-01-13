package irvine.oeis.a261;

import irvine.oeis.LinearRecurrence;

/**
 * A261934.
 * @author Sean A. Irvine
 */
public class A261934 extends LinearRecurrence {

  /** Construct the sequence. */
  public A261934() {
    super(new long[] {1, -1, 0, 0, -18, 18, 0, 0, 1}, new long[] {7, 17, 26, 52, 205, 383, 544, 1010, 3755});
  }
}
