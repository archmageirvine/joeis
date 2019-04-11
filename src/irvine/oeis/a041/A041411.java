package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041411 Denominators of continued fraction convergents to <code>sqrt(220)</code>.
 * @author Sean A. Irvine
 */
public class A041411 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041411() {
    super(new long[] {-1, 0, 0, 0, 178, 0, 0, 0}, new long[] {1, 1, 5, 6, 173, 179, 889, 1068});
  }
}
