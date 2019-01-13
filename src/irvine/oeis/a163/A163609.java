package irvine.oeis.a163;

import irvine.oeis.LinearRecurrence;

/**
 * A163609.
 * @author Sean A. Irvine
 */
public class A163609 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163609() {
    super(new long[] {-7, 6}, new long[] {5, 19});
  }
}
