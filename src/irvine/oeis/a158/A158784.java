package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158784.
 * @author Sean A. Irvine
 */
public class A158784 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158784() {
    super(new long[] {64, 2, 0}, new long[] {1, 4, 16});
  }
}
