package irvine.oeis.a033;

import irvine.oeis.LinearRecurrence;

/**
 * A033578.
 * @author Sean A. Irvine
 */
public class A033578 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033578() {
    super(new long[] {1, -3, 3}, new long[] {1, 6, 35});
  }
}
