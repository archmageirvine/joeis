package irvine.oeis.a103;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A103321 Expansion of 1 / ((1-x-x^2-x^3)*(1-x-x^3)).
 * @author Sean A. Irvine
 */
public class A103321 extends LinearRecurrence {

  /** Construct the sequence. */
  public A103321() {
    super(new long[] {-1, -1, -2, 1, 0, 2}, new long[] {1, 2, 4, 9, 18, 35});
  }
}
