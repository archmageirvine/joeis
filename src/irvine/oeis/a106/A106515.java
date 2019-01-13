package irvine.oeis.a106;

import irvine.oeis.LinearRecurrence;

/**
 * A106515.
 * @author Sean A. Irvine
 */
public class A106515 extends LinearRecurrence {

  /** Construct the sequence. */
  public A106515() {
    super(new long[] {-1, -3, 0, 3}, new long[] {1, 2, 6, 15});
  }
}
