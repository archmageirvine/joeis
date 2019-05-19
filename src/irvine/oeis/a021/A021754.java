package irvine.oeis.a021;

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A021754 Expansion of <code>1/((1-x)(1-4x)(1-5x)(1-7x))</code>.
 * @author Sean A. Irvine
 */
public class A021754 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A021754() {
    super(new long[] {1},
      new long[] {1, -17, 99, -223, 140});
  }
}
