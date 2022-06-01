package irvine.oeis.a028;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A028203 Expansion of 1/((1-6x)(1-7x)(1-8x)(1-12x)).
 * @author Sean A. Irvine
 */
public class A028203 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028203() {
    super(new long[] {-4032, 2088, -398, 33}, new long[] {1, 33, 691, 11757});
  }
}
