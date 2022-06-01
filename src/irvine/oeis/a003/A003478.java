package irvine.oeis.a003;

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A003478 Expansion of 1/(1-2x)(1-x-2x^3 ).
 * @author Sean A. Irvine
 */
public class A003478 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A003478() {
    super(new long[] {1},
      new long[] {1, -3, 2, -2, 4});
  }
}

