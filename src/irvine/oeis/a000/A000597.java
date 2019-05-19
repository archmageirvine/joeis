package irvine.oeis.a000;

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A000597 Central factorial numbers.
 * @author Sean A. Irvine
 */
public class A000597 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A000597() {
    super(new long[] {36, 460, 1065, 603, 75, 1},
      new long[] {1, -10, 45, -120, 210, -252, 210, -120, 45, -10, 1});
  }
}
