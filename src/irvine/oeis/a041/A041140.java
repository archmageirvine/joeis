package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041140 Numerators of continued fraction convergents to <code>sqrt(79)</code>.
 * @author Sean A. Irvine
 */
public class A041140 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041140() {
    super(new long[] {-1, 0, 0, 0, 160, 0, 0, 0}, new long[] {8, 9, 71, 80, 1351, 1431, 11368, 12799});
  }
}
