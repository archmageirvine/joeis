package irvine.oeis.a021;

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A021854.
 * @author Sean A. Irvine
 */
public class A021854 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A021854() {
    super(new long[] {1}, new long[] {1, -20, 135, -340, 224});
  }
}
