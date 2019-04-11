package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041049 Denominators of continued fraction convergents to <code>sqrt(30)</code>.
 * @author Sean A. Irvine
 */
public class A041049 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041049() {
    super(new long[] {-1, 0, 22, 0}, new long[] {1, 2, 21, 44});
  }
}
