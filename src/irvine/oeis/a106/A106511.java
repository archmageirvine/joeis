package irvine.oeis.a106;

import irvine.oeis.LinearRecurrence;

/**
 * A106511.
 * @author Sean A. Irvine
 */
public class A106511 extends LinearRecurrence {

  /** Construct the sequence. */
  public A106511() {
    super(new long[] {1, 0, -1, -2}, new long[] {1, 0, 0, 0});
  }
}
