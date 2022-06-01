package irvine.oeis.a021;

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A021644 Expansion of 1/((1-x)(1-3x)(1-8x)(1-10x)).
 * @author Sean A. Irvine
 */
public class A021644 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A021644() {
    super(new long[] {1},
      new long[] {1, -22, 155, -374, 240});
  }
}
