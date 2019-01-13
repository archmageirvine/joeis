package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017370.
 * @author Sean A. Irvine
 */
public class A017370 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017370() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {262144, 34012224, 481890304, 3010936384L, 12230590464L, 38068692544L, 98867482624L});
  }
}
