package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158593.
 * @author Sean A. Irvine
 */
public class A158593 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158593() {
    super(new long[] {1, -3, 3}, new long[] {1, 39, 153});
  }
}
