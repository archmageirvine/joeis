package irvine.oeis.a021;

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A021644.
 * @author Sean A. Irvine
 */
public class A021644 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A021644() {
    super(new long[] {1}, new long[] {1, -22, 155, -374, 240});
  }
}
