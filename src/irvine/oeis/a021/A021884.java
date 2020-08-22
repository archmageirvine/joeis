package irvine.oeis.a021;

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A021884 Expansion of 1/((1-x)(1-4x)(1-7x)(1-11x)).
 * @author Sean A. Irvine
 */
public class A021884 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A021884() {
    super(new long[] {1},
      new long[] {1, -23, 171, -457, 308});
  }
}
