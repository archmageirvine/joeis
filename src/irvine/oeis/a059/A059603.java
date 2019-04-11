package irvine.oeis.a059;

import irvine.oeis.LinearRecurrence;

/**
 * A059603 Expansion of <code>(1+15*x+15*x^2+x^3)/(1-x)^12</code>.
 * @author Sean A. Irvine
 */
public class A059603 extends LinearRecurrence {

  /** Construct the sequence. */
  public A059603() {
    super(new long[] {-1, 12, -66, 220, -495, 792, -924, 792, -495, 220, -66, 12}, new long[] {1, 27, 273, 1715, 8007, 30381, 98735, 284349, 742950, 1791426, 4037670, 8591154});
  }
}
