package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041431 Denominators of continued fraction convergents to sqrt(231).
 * @author Sean A. Irvine
 */
public class A041431 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041431() {
    super(new long[] {-1, 0, 152, 0}, new long[] {1, 5, 151, 760});
  }
}
