package irvine.oeis.a200;

import irvine.oeis.LinearRecurrence;

/**
 * A200999.
 * @author Sean A. Irvine
 */
public class A200999 extends LinearRecurrence {

  /** Construct the sequence. */
  public A200999() {
    super(new long[] {1, -195, 195}, new long[] {0, 28, 5460});
  }
}
