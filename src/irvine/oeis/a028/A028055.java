package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028055 Expansion of 1/((1-3x)(1-5x)(1-6x)(1-9x)).
 * @author Sean A. Irvine
 */
public class A028055 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028055() {
    super(new long[] {-810, 657, -189, 23}, new long[] {1, 23, 340, 4130});
  }
}
