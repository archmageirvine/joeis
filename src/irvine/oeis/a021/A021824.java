package irvine.oeis.a021;

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A021824 Expansion of <code>1/((1-x)(1-4x)(1-6x)(1-9x))</code>.
 * @author Sean A. Irvine
 */
public class A021824 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A021824() {
    super(new long[] {1}, new long[] {1, -20, 133, -330, 216});
  }
}
