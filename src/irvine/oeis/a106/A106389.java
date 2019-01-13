package irvine.oeis.a106;

import irvine.oeis.LinearRecurrence;

/**
 * A106389.
 * @author Sean A. Irvine
 */
public class A106389 extends LinearRecurrence {

  /** Construct the sequence. */
  public A106389() {
    super(new long[] {-1, 1, 1}, new long[] {1, 11, 14});
  }
}
