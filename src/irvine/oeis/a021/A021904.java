package irvine.oeis.a021;

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A021904 Expansion of <code>1/((1-x)(1-4x)(1-8x)(1-9x))</code>.
 * @author Sean A. Irvine
 */
public class A021904 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A021904() {
    super(new long[] {1}, new long[] {1, -22, 161, -428, 288});
  }
}
