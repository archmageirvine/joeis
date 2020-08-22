package irvine.oeis.a242;

import irvine.oeis.LinearRecurrence;

/**
 * A242358 Number of inequivalent (mod D_4) ways five checkers can be placed on an n X n board.
 * @author Sean A. Irvine
 */
public class A242358 extends LinearRecurrence {

  /** Construct the sequence. */
  public A242358() {
    super(new long[] {1, -5, 4, 20, -40, -16, 100, -44, -110, 110, 44, -100, 16, 40, -20, -4, 5}, new long[] {23, 567, 6814, 47358, 239511, 954226, 3207212, 9414828, 24862239, 60136329, 135311658, 286229762, 574460495, 1101240084, 2028333848, 3605765688L, 6211552455L});
  }
}
