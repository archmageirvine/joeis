package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041310 Numerators of continued fraction convergents to <code>sqrt(168)</code>.
 * @author Sean A. Irvine
 */
public class A041310 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041310() {
    super(new long[] {-1, 0, 26, 0}, new long[] {12, 13, 324, 337});
  }
}
