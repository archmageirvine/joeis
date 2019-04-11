package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024113 <code>9^n-n^12</code>.
 * @author Sean A. Irvine
 */
public class A024113 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024113() {
    super(new long[] {-9, 118, -715, 2652, -6721, 12298, -16731, 17160, -13299, 7722, -3289, 988, -195, 22}, new long[] {1, 8, -4015, -530712, -16770655, -244081576, -2176250895L, -13836504232L, -68676430015L, -282042115992L, -996513215599L, -3107047317112L, -8633670911775L, -20756219294152L});
  }
}
