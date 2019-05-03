package irvine.oeis.a058;

import irvine.oeis.LinearRecurrence;

/**
 * A058796 Row 5 of <code>A007754</code>.
 * @author Sean A. Irvine
 */
public class A058796 extends LinearRecurrence {

  /** Construct the sequence. */
  public A058796() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {33, 492, 2055, 5898, 13797, 28248});
  }
}
