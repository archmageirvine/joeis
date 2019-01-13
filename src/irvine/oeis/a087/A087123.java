package irvine.oeis.a087;

import irvine.oeis.LinearRecurrence;

/**
 * A087123.
 * @author Sean A. Irvine
 */
public class A087123 extends LinearRecurrence {

  /** Construct the sequence. */
  public A087123() {
    super(new long[] {-1, 0, 3, 0}, new long[] {1, 2, 1, 5});
  }
}
