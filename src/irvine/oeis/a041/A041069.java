package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041069 Denominators of continued fraction convergents to sqrt(41).
 * @author Sean A. Irvine
 */
public class A041069 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041069() {
    super(new long[] {1, 0, 0, 64, 0, 0}, new long[] {1, 2, 5, 62, 129, 320});
  }
}
