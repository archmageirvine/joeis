package irvine.oeis.a087;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A087936 Perrin sequence of order 6.
 * @author Sean A. Irvine
 */
public class A087936 extends LinearRecurrence {

  /** Construct the sequence. */
  public A087936() {
    super(new long[] {1, 1, 0, 0, 0, 0}, new long[] {6, 0, 0, 0, 0, 5});
  }
}
