package irvine.oeis.a123;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A123867 a(n) = n^10 - 1.
 * @author Sean A. Irvine
 */
public class A123867 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123867() {
    super(new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11}, new long[] {0, 1023, 59048, 1048575, 9765624, 60466175, 282475248, 1073741823, 3486784400L, 9999999999L, 25937424600L});
  }
}
