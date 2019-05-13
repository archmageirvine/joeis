package irvine.oeis.a021;

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A021834.
 * @author Sean A. Irvine
 */
public class A021834 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A021834() {
    super(new long[] {1}, new long[] {1, -22, 155, -398, 264});
  }
}
