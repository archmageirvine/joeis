package irvine.oeis.a065;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a000.A000041;

/**
 * A065729 Numbers k such that the k-th partition number (A000041(k)) is a semiprime.
 * @author Sean A. Irvine
 */
public class A065729 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A065729() {
    super(1, 0, new A000041(), SEMIPRIME);
  }
}
