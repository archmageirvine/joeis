package irvine.oeis.a253;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A253681 Integer squares c^2 that are equal to the sum of an odd number M of consecutive cubed integers b^3 + (b+1)^3 + ... + (b+M-1)^3 = c^2 starting at b(n) (A253679).
 * @author Sean A. Irvine
 */
public class A253681 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253681() {
    super(1, new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11}, new long[] {41616, 8643600, 265559616, 3359361600L, 25300083600L, 135426944016L, 568998662400L, 1995144950016L, 6080268272400L, 16566690848400L, 41192058954816L});
  }
}
