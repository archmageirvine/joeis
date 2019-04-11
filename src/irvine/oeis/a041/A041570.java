package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041570 Numerators of continued fraction convergents to <code>sqrt(303)</code>.
 * @author Sean A. Irvine
 */
public class A041570 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041570() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 5048, 0, 0, 0, 0, 0}, new long[] {17, 35, 87, 470, 1027, 2524, 86843, 176210, 439263, 2372525, 5184313, 12741151});
  }
}
