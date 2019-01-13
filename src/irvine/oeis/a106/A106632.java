package irvine.oeis.a106;

import irvine.oeis.LinearRecurrence;

/**
 * A106632.
 * @author Sean A. Irvine
 */
public class A106632 extends LinearRecurrence {

  /** Construct the sequence. */
  public A106632() {
    super(new long[] {-27, -3, -1}, new long[] {-1, 1, -25});
  }
}
