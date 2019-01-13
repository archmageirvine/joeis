package irvine.oeis.a292;

import irvine.oeis.LinearRecurrence;

/**
 * A292327.
 * @author Sean A. Irvine
 */
public class A292327 extends LinearRecurrence {

  /** Construct the sequence. */
  public A292327() {
    super(new long[] {-1, -4, -2, 4}, new long[] {2, 5, 14, 38});
  }
}
