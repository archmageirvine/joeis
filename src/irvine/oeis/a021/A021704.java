package irvine.oeis.a021;

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A021704 Expansion of <code>1/((1-x)(1-3x)(1-9x)(1-12x))</code>.
 * @author Sean A. Irvine
 */
public class A021704 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A021704() {
    super(new long[] {1}, new long[] {1, -25, 195, -495, 324});
  }
}
