package irvine.oeis.a054;

import irvine.oeis.LinearRecurrence;

/**
 * A054624.
 * @author Sean A. Irvine
 */
public class A054624 extends LinearRecurrence {

  /** Construct the sequence. */
  public A054624() {
    super(new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11}, new long[] {0, 1, 108, 5934, 104968, 976887, 6047412, 28249228, 107377488, 348684381, 1000010044});
  }
}
