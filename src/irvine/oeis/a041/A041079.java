package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041079 Denominators of continued fraction convergents to <code>sqrt(46)</code>.
 * @author Sean A. Irvine
 */
public class A041079 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041079() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 48670, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 1, 4, 5, 9, 23, 147, 317, 464, 781, 2807, 3588, 45863, 49451, 194216, 243667, 437883, 1119433, 7154481, 15428395, 22582876, 38011271, 136616689, 174627960});
  }
}
