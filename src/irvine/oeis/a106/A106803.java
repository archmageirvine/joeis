package irvine.oeis.a106;

import irvine.oeis.LinearRecurrence;

/**
 * A106803.
 * @author Sean A. Irvine
 */
public class A106803 extends LinearRecurrence {

  /** Construct the sequence. */
  public A106803() {
    super(new long[] {-1, 1, 2}, new long[] {0, 1, 1});
  }
}
