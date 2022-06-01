package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017931 Expansion of 1/((1-3x)(1-6x)(1-7x)).
 * @author Sean A. Irvine
 */
public class A017931 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017931() {
    super(new long[] {126, -81, 16}, new long[] {1, 16, 175});
  }
}
