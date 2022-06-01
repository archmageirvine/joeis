package irvine.oeis.a021;

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A021829 Expansion of 1/((1-x)(1-4x)(1-6x)(1-10x)).
 * @author Sean A. Irvine
 */
public class A021829 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A021829() {
    super(new long[] {1},
      new long[] {1, -21, 144, -364, 240});
  }
}
