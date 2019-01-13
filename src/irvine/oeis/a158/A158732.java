package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158732.
 * @author Sean A. Irvine
 */
public class A158732 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158732() {
    super(new long[] {1, -3, 3}, new long[] {1, 69, 273});
  }
}
