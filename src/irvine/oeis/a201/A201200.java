package irvine.oeis.a201;

import irvine.oeis.LinearRecurrence;

/**
 * A201200 Total number of round trips of length n on the closed Laguerre graph Lc_4 divided by 4.
 * @author Sean A. Irvine
 */
public class A201200 extends LinearRecurrence {

  /** Construct the sequence. */
  public A201200() {
    super(new long[] {44, 64, -68, 16}, new long[] {1, 4, 30, 256});
  }
}
