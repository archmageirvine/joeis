package irvine.oeis.a021;

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A021644 Expansion of <code>1/((1-x)(1-3x)(1-8x)(1-10x))</code>.
 * @author Sean A. Irvine
 */
public class A021644 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A021644() {
    super(new long[] {1}, new long[] {1, -22, 155, -374, 240});
  }
}
