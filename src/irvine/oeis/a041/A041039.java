package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041039 Denominators of continued fraction convergents to <code>sqrt(24)</code>.
 * @author Sean A. Irvine
 */
public class A041039 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041039() {
    super(new long[] {-1, 0, 10, 0}, new long[] {1, 1, 9, 10});
  }
}
