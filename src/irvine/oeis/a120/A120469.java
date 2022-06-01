package irvine.oeis.a120;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A120469 14 X 14 face centered cubic bonding Matrix Markov.
 * @author Sean A. Irvine
 */
public class A120469 extends LinearRecurrence {

  /** Construct the sequence. */
  public A120469() {
    super(new long[] {48, 436, 146, -2902, -3458, 2008, 3892, 265, -1292, -366, 112, 48, 0}, new long[] {1, 5, 34, 240, 1755, 12787, 93549, 683653, 4999040, 36546925, 267210674, 1953631757, 14283593763L});
  }
}
