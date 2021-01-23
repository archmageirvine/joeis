package irvine.oeis.a021;

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A021894 Expansion of 1/((1-x)(1-4x)(1-7x)(1-12x)).
 * @author Sean A. Irvine
 */
public class A021894 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A021894() {
    super(new long[] {1},
      new long[] {1, -24, 183, -496, 336});
  }
}
