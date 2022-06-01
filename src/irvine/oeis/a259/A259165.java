package irvine.oeis.a259;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A259165 Positive heptagonal numbers (A000566) that are pentagonal numbers (A000326) divided by 2.
 * @author Sean A. Irvine
 */
public class A259165 extends LinearRecurrence {

  /** Construct the sequence. */
  public A259165() {
    super(new long[] {1, -232323, 232323}, new long[] {540, 125482435, 29152330292086L});
  }
}
