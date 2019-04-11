package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041608 Numerators of continued fraction convergents to <code>sqrt(322)</code>.
 * @author Sean A. Irvine
 */
public class A041608 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041608() {
    super(new long[] {-1, 0, 0, 0, 646, 0, 0, 0}, new long[] {17, 18, 305, 323, 11287, 11610, 197047, 208657});
  }
}
