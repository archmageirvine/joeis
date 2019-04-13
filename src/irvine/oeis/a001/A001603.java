package irvine.oeis.a001;

import irvine.oeis.RatPolyGfSequence;

/**
 * A001603 Odd-indexed terms of A124296.
 * @author Sean A. Irvine
 */
public class A001603 extends RatPolyGfSequence {

  /** Construct the sequence. */
  public A001603() {
    super(new long[] {-1, 0, -13, 0, -1}, new long[] {-1, 11, -33, 33, -11, 1});
  }
}

