package irvine.oeis.a163;

import irvine.oeis.LinearRecurrence;

/**
 * A163608.
 * @author Sean A. Irvine
 */
public class A163608 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163608() {
    super(new long[] {-2, 4}, new long[] {5, 14});
  }
}
