package irvine.oeis.a127;

import irvine.oeis.LinearRecurrence;

/**
 * A127864 Number of tilings of a <code>2xn</code> board with <code>1x1</code> and L-shaped tiles (where the L-shaped tiles cover <code>3</code> squares).
 * @author Sean A. Irvine
 */
public class A127864 extends LinearRecurrence {

  /** Construct the sequence. */
  public A127864() {
    super(new long[] {2, 4, 1}, new long[] {1, 1, 5});
  }
}
