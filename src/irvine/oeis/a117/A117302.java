package irvine.oeis.a117;

import irvine.oeis.LinearRecurrence;

/**
 * A117302 Number of cases in which the first player gets killed in a Russian roulette game when 7 players use a gun with n chambers and the number of the bullets can be from 1 to <code>n</code>. In the game they do not rotate the cylinder after the game starts.
 * @author Sean A. Irvine
 */
public class A117302 extends LinearRecurrence {

  /** Construct the sequence. */
  public A117302() {
    super(new long[] {-2, 1, 0, 0, 0, 0, 0, 2}, new long[] {1, 2, 4, 8, 16, 32, 64, 129});
  }
}
