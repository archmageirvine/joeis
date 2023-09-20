package irvine.oeis.a065;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a000.A000041;

/**
 * A065729 n-th partition number (A000041(n)) is a semiprime.
 * @author Sean A. Irvine
 */
public class A065729 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A065729() {
    super(1, 0, new A000041(), SEMIPRIME);
  }
}
