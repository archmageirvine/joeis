package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017953 Expansion of 1/((1-3x)(1-6x)(1-11x)).
 * @author Sean A. Irvine
 */
public class A017953 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017953() {
    super(new long[] {198, -117, 20}, new long[] {1, 20, 283});
  }
}
