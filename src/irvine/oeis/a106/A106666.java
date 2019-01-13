package irvine.oeis.a106;

import irvine.oeis.LinearRecurrence;

/**
 * A106666.
 * @author Sean A. Irvine
 */
public class A106666 extends LinearRecurrence {

  /** Construct the sequence. */
  public A106666() {
    super(new long[] {2, -4, 0, 3}, new long[] {1, 3, 5, 13});
  }
}
