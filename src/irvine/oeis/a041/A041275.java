package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041275 Denominators of continued fraction convergents to <code>sqrt(150)</code>.
 * @author Sean A. Irvine
 */
public class A041275 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041275() {
    super(new long[] {-1, 0, 98, 0}, new long[] {1, 4, 97, 392});
  }
}
