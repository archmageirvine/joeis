package irvine.oeis.a061;

import irvine.oeis.LinearRecurrence;

/**
 * A061534.
 * @author Sean A. Irvine
 */
public class A061534 extends LinearRecurrence {

  /** Construct the sequence. */
  public A061534() {
    super(new long[] {-1, 1, 3}, new long[] {1, 3, 9});
  }
}
