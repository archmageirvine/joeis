package irvine.oeis.a000;

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A000750 Expansion of bracket function.
 * @author Sean A. Irvine
 */
public class A000750 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A000750() {
    super(new long[] {1},
      new long[] {1, 5, 10, 10, 5});
  }
}
