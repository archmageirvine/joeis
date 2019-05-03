package irvine.oeis.a090;

import irvine.oeis.LinearRecurrence;

/**
 * A090449 Fifth column <code>(m=4)</code> of triangle <code>A090447</code>.
 * @author Sean A. Irvine
 */
public class A090449 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090449() {
    super(new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11}, new long[] {96, 2500, 27000, 180075, 878080, 3429216, 11340000, 32942250, 86248800, 207352860, 464199736});
  }
}
