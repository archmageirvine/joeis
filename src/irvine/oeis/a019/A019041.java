package irvine.oeis.a019;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A019041 Expansion of 1/((1-4x)(1-5x)(1-12x)).
 * @author Sean A. Irvine
 */
public class A019041 extends LinearRecurrence {

  /** Construct the sequence. */
  public A019041() {
    super(new long[] {240, -128, 21}, new long[] {1, 21, 313});
  }
}
