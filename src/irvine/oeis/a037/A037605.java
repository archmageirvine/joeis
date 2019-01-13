package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037605.
 * @author Sean A. Irvine
 */
public class A037605 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037605() {
    super(new long[] {-5, 1, 0, 5}, new long[] {1, 7, 38, 191});
  }
}
