package irvine.oeis.a363;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a001.A001045;

/**
 * A363837 Numbers k such that k-th Jacobsthal number A001045(k) is a semiprime.
 * @author Sean A. Irvine
 */
public class A363837 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A363837() {
    super(1, 0, new A001045(), SEMIPRIME);
  }
}
