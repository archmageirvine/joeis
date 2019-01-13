package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042202.
 * @author Sean A. Irvine
 */
public class A042202 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042202() {
    super(new long[] {-1, 0, 1252, 0}, new long[] {25, 626, 31325, 783751});
  }
}
