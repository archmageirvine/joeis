package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041577 Denominators of continued fraction convergents to <code>sqrt(306)</code>.
 * @author Sean A. Irvine
 */
public class A041577 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041577() {
    super(new long[] {-1, 0, 70, 0}, new long[] {1, 2, 69, 140});
  }
}
