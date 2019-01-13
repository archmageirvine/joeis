package irvine.oeis.a087;

import irvine.oeis.LinearRecurrence;

/**
 * A087935.
 * @author Sean A. Irvine
 */
public class A087935 extends LinearRecurrence {

  /** Construct the sequence. */
  public A087935() {
    super(new long[] {1, 1, 0, 0, 0}, new long[] {5, 0, 0, 0, 4});
  }
}
