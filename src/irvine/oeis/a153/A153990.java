package irvine.oeis.a153;

import irvine.oeis.LinearRecurrence;

/**
 * A153990 Period <code>6</code>: repeat <code>[1, 2, 5, 4, 7, 8]</code>.
 * @author Sean A. Irvine
 */
public class A153990 extends LinearRecurrence {

  /** Construct the sequence. */
  public A153990() {
    super(new long[] {1, 0, 0, 0, 0, 0}, new long[] {1, 2, 5, 4, 7, 8});
  }
}
