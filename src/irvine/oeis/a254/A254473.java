package irvine.oeis.a254;

import irvine.oeis.LinearRecurrence;

/**
 * A254473.
 * @author Sean A. Irvine
 */
public class A254473 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254473() {
    super(new long[] {-1, 4, -6, 4}, new long[] {7, 87, 335, 847});
  }
}
