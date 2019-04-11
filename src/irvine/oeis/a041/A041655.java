package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041655 Denominators of continued fraction convergents to <code>sqrt(346)</code>.
 * @author Sean A. Irvine
 */
public class A041655 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041655() {
    super(new long[] {1, 0, 0, 0, 0, 186, 0, 0, 0, 0}, new long[] {1, 1, 2, 3, 5, 183, 188, 371, 559, 930});
  }
}
