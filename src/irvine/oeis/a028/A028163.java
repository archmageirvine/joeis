package irvine.oeis.a028;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A028163 Expansion of 1/((1-4x)(1-9x)(1-11x)(1-12x)).
 * @author Sean A. Irvine
 */
public class A028163 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028163() {
    super(new long[] {-4752, 2544, -467, 36}, new long[] {1, 36, 829, 15576});
  }
}
