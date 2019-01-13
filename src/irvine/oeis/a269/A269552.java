package irvine.oeis.a269;

import irvine.oeis.LinearRecurrence;

/**
 * A269552.
 * @author Sean A. Irvine
 */
public class A269552 extends LinearRecurrence {

  /** Construct the sequence. */
  public A269552() {
    super(new long[] {1, -99, 99}, new long[] {3, 203, 19803});
  }
}
