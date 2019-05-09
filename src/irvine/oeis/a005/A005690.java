package irvine.oeis.a005;

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A005690 Number of Twopins positions.
 * @author Sean A. Irvine
 */
public class A005690 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A005690() {
    super(new long[] {1}, new long[] {1, -2, 0, 2, -1, 0, -2, 2, 0, 0, 0, 0, 1});
  }
}
