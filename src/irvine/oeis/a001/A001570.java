package irvine.oeis.a001;

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A001570 Numbers k such that <code>k^2</code> is centered hexagonal.
 * @author Sean A. Irvine
 */
public class A001570 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A001570() {
    super(new long[] {0, 1, -1}, new long[] {1, -14, 1});
    next();
  }
}
