package irvine.oeis.a001;

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A001925 From rook polynomials.
 * @author Sean A. Irvine
 */
public class A001925 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A001925() {
    super(new long[] {1, 1}, new long[] {1, -5, 8, -2, -6, 4, 1, -1});
  }
}
