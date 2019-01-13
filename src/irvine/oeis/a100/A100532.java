package irvine.oeis.a100;

import irvine.oeis.LinearRecurrence;

/**
 * A100532.
 * @author Sean A. Irvine
 */
public class A100532 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100532() {
    super(new long[] {1, 1, 1, 1}, new long[] {2, 3, 5, 7});
  }
}
