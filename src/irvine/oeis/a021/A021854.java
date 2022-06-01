package irvine.oeis.a021;

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A021854 Expansion of 1/((1-x)(1-4x)(1-7x)(1-8x)).
 * @author Sean A. Irvine
 */
public class A021854 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A021854() {
    super(new long[] {1},
      new long[] {1, -20, 135, -340, 224});
  }
}
