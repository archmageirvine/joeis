package irvine.oeis.a088;

import irvine.oeis.LinearRecurrence;

/**
 * A088893.
 * @author Sean A. Irvine
 */
public class A088893 extends LinearRecurrence {

  /** Construct the sequence. */
  public A088893() {
    super(new long[] {1, -15, 105, -455, 1365, -3003, 5005, -6435, 6435, -5005, 3003, -1365, 455, -105, 15}, new long[] {0, 1, 437, 32338, 898774, 13420861, 130567049, 929084572, 5210829060L, 24240197433L, 96985597357L, 342789175982L, 1092151142842L, 3186269918917L, 8618003504977L});
  }
}
