package irvine.oeis.a021;

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A021634.
 * @author Sean A. Irvine
 */
public class A021634 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A021634() {
    super(new long[] {1}, new long[] {1, -21, 143, -339, 216});
  }
}
