package irvine.oeis.a021;

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A021704.
 * @author Sean A. Irvine
 */
public class A021704 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A021704() {
    super(new long[] {1}, new long[] {1, -25, 195, -495, 324});
  }
}
