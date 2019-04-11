package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041609 Denominators of continued fraction convergents to <code>sqrt(322)</code>.
 * @author Sean A. Irvine
 */
public class A041609 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041609() {
    super(new long[] {-1, 0, 0, 0, 646, 0, 0, 0}, new long[] {1, 1, 17, 18, 629, 647, 10981, 11628});
  }
}
