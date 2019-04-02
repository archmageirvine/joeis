package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041377 Denominators of continued fraction convergents to sqrt(203).
 * @author Sean A. Irvine
 */
public class A041377 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041377() {
    super(new long[] {-1, 0, 114, 0}, new long[] {1, 4, 113, 456});
  }
}
