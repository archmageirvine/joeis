package irvine.oeis.a194;

import irvine.oeis.LinearRecurrence;

/**
 * A194431.
 * @author Sean A. Irvine
 */
public class A194431 extends LinearRecurrence {

  /** Construct the sequence. */
  public A194431() {
    super(new long[] {1, -3, 3}, new long[] {1, 19, 53});
  }
}
