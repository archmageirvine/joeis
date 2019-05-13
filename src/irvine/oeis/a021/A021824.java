package irvine.oeis.a021;

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A021824.
 * @author Sean A. Irvine
 */
public class A021824 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A021824() {
    super(new long[] {1}, new long[] {1, -20, 133, -330, 216});
  }
}
