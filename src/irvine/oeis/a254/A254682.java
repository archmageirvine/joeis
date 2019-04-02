package irvine.oeis.a254;

import irvine.oeis.LinearRecurrence;

/**
 * A254682 Fifth partial sums of fifth powers (A000584).
 * @author Sean A. Irvine
 */
public class A254682 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254682() {
    super(new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11}, new long[] {1, 37, 418, 2754, 13080, 49632, 159654, 452166, 1157013, 2724865, 5988268});
  }
}
