package irvine.oeis.a007;

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A007904 Crystal ball sequence for diamond.
 * @author Sean A. Irvine
 */
public class A007904 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A007904() {
    super(new long[] {-1, -2, -4, -2, -1},
      new long[] {-1, 3, -2, -2, 3, -1});
  }
}

