package irvine.oeis.a072;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a024.A024919;

/**
 * A072663 Numbers m such that Sum_{k=1..m} (-1)^k*k*floor(m/k) = 0.
 * @author Sean A. Irvine
 */
public class A072663 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A072663() {
    super(1, new A024919(), ZERO);
  }
}
