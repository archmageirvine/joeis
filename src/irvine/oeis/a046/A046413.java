package irvine.oeis.a046;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a000.A000042;

/**
 * A046413 Numbers k such that the repunit of length k (11...11, with k 1's) has exactly 2 prime factors.
 * @author Sean A. Irvine
 */
public class A046413 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A046413() {
    super(1, 1, new A000042(), SEMIPRIME);
  }
}
