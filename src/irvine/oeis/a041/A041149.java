package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041149 Denominators of continued fraction convergents to sqrt(84).
 * @author Sean A. Irvine
 */
public class A041149 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041149() {
    super(new long[] {-1, 0, 110, 0}, new long[] {1, 6, 109, 660});
  }
}
