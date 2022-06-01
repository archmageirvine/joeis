package irvine.oeis.a001;

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A001926 G.f.: (1+x)^2/[(1-x)^4(1-x-x^2)^3].
 * @author Sean A. Irvine
 */
public class A001926 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A001926() {
    super(new long[] {1, 2, 1},
      new long[] {1, -7, 18, -17, -7, 24, -9, -9, 6, 1, -1});
  }
}
