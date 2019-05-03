package irvine.oeis.a009;

import irvine.oeis.CoordinationSequence;

/**
 * A009863 Coordination sequence <code>T2</code> for Zeolite Code <code>-WEN</code>.
 * @author Sean A. Irvine
 */
public class A009863 extends CoordinationSequence {

  /** Construct the sequence. */
  public A009863() {
    super(
      new long[] {1, 4, 9, 18, 30, 40, 48, 59, 72, 81, 82, 76, 68, 56, 36, 12, -12, -36, -56, -68, -76, -82, -81, -72, -59, -48, -40, -30, -18, -9, -4, -1},
      new int[] {3, 7, 10, 11});
  }
}

