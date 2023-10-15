package irvine.oeis.a250;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a000.A000129;

/**
 * A250292 Numbers k such that Pell(k) is a semiprime.
 * @author Sean A. Irvine
 */
public class A250292 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A250292() {
    super(1, 0, new A000129(), SEMIPRIME);
  }
}
