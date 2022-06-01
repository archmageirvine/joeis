package irvine.oeis.a004;

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A004294 Expansion of (1+2*x+x^2)/(1-34*x+x^2).
 * @author Sean A. Irvine
 */
public class A004294 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A004294() {
    super(new long[] {1, 2, 1},
      new long[] {1, -34, 1});
  }
}
