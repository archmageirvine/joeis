package irvine.oeis.a239;

import irvine.oeis.LinearRecurrence;

/**
 * A239449.
 * @author Sean A. Irvine
 */
public class A239449 extends LinearRecurrence {

  /** Construct the sequence. */
  public A239449() {
    super(new long[] {1, -3, 3}, new long[] {1, 3, 19});
  }
}
