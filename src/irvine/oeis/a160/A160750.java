package irvine.oeis.a160;

import irvine.oeis.LinearRecurrence;

/**
 * A160750 Expansion of <code>(1+11*x+24*x^2+11*x^3+10*x^4)/(1-x)^5</code>.
 * @author Sean A. Irvine
 */
public class A160750 extends LinearRecurrence {

  /** Construct the sequence. */
  public A160750() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 16, 94, 331, 880});
  }
}
