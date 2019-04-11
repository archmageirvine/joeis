package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041249 Denominators of continued fraction convergents to <code>sqrt(136)</code>.
 * @author Sean A. Irvine
 */
public class A041249 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041249() {
    super(new long[] {-1, 0, 0, 0, 70, 0, 0, 0}, new long[] {1, 1, 2, 3, 68, 71, 139, 210});
  }
}
