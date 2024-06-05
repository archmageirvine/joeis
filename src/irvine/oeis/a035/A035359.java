package irvine.oeis.a035;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a000.A000009;

/**
 * A035359 Number of partitions-into-distinct-parts of n (A000009) is a prime.
 * @author Sean A. Irvine
 */
public class A035359 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A035359() {
    super(1, 0, new A000009(), PRIME);
  }
}

