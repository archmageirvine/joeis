package irvine.oeis.a021;

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A021754.
 * @author Sean A. Irvine
 */
public class A021754 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A021754() {
    super(new long[] {1}, new long[] {1, -17, 99, -223, 140});
  }
}
