package irvine.oeis.a254;

import irvine.oeis.LinearRecurrence;

/**
 * A254869 Seventh partial sums of cubes (A000578).
 * @author Sean A. Irvine
 */
public class A254869 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254869() {
    super(new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11}, new long[] {1, 15, 111, 561, 2211, 7293, 21021, 54483, 129558, 286858, 598026});
  }
}
