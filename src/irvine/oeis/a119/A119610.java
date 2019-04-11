package irvine.oeis.a119;

import irvine.oeis.LinearRecurrence;

/**
 * A119610 Number of cases in which the first player is killed in a Russian roulette game where 5 players use a gun with n chambers and the number of bullets can be from 1 to <code>n.</code> Players do not rotate the cylinder after the game starts.
 * @author Sean A. Irvine
 */
public class A119610 extends LinearRecurrence {

  /** Construct the sequence. */
  public A119610() {
    super(new long[] {-2, 1, 0, 0, 0, 2}, new long[] {1, 2, 4, 8, 16, 33});
  }
}
