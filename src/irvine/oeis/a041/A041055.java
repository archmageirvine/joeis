package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041055 Denominators of continued fraction convergents to <code>sqrt(33)</code>.
 * @author Sean A. Irvine
 */
public class A041055 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041055() {
    super(new long[] {-1, 0, 0, 0, 46, 0, 0, 0}, new long[] {1, 1, 3, 4, 43, 47, 137, 184});
  }
}
