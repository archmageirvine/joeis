package irvine.oeis.a225;

import irvine.oeis.FiniteSequence;

/**
 * A225613 The largest n-digit number where first k digits are divisible by k-th prime for k = 1..n.
 * @author Georg Fischer
 */
public class A225613 extends FiniteSequence {

  /** Construct the sequence. */
  public A225613() {
    super(8, 87, 875, 8757, 87571, 875719, 8757193, 87571931, 875719319L, 8757193191L);
  }
}
