package irvine.oeis.a087;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A087935 Perrin sequence of order 5.
 * @author Sean A. Irvine
 */
public class A087935 extends LinearRecurrence {

  /** Construct the sequence. */
  public A087935() {
    super(new long[] {1, 1, 0, 0, 0}, new long[] {5, 0, 0, 0, 4});
  }
}
