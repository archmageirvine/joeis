package irvine.oeis.a268;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A268358 Number of n-digit numbers in base ten having at least five different digits with no leading zeros allowed.
 * @author Sean A. Irvine
 */
public class A268358 extends LinearRecurrence {

  /** Construct the sequence. */
  public A268358() {
    super(5, new long[] {240, -524, 400, -135, 20}, new long[] {27216, 544320, 7212240, 81648000, 862774416});
  }
}
