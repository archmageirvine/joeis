package irvine.oeis.a021;

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A021829.
 * @author Sean A. Irvine
 */
public class A021829 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A021829() {
    super(new long[] {1}, new long[] {1, -21, 144, -364, 240});
  }
}
