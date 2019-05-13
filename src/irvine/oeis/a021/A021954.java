package irvine.oeis.a021;

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A021954.
 * @author Sean A. Irvine
 */
public class A021954 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A021954() {
    super(new long[] {1}, new long[] {1, -24, 189, -526, 360});
  }
}
