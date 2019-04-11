package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041007 Denominators of continued fraction convergents to <code>sqrt(6)</code>.
 * @author Sean A. Irvine
 */
public class A041007 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041007() {
    super(new long[] {-1, 0, 10, 0}, new long[] {1, 2, 9, 20});
  }
}
