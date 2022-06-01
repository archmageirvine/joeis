package irvine.oeis.a021;

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A021634 Expansion of 1/((1-x)(1-3x)(1-8x)(1-9x)).
 * @author Sean A. Irvine
 */
public class A021634 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A021634() {
    super(new long[] {1},
      new long[] {1, -21, 143, -339, 216});
  }
}
