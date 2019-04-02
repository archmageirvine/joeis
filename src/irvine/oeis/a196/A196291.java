package irvine.oeis.a196;

import irvine.oeis.LinearRecurrence;

/**
 * A196291 n^10 - n.
 * @author Sean A. Irvine
 */
public class A196291 extends LinearRecurrence {

  /** Construct the sequence. */
  public A196291() {
    super(new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11}, new long[] {0, 0, 1022, 59046, 1048572, 9765620, 60466170, 282475242, 1073741816, 3486784392L, 9999999990L});
  }
}
