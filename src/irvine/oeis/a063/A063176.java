package irvine.oeis.a063;

import irvine.oeis.IntersectionSequence;

/**
 * A063176 Composites for which the row of the prime-composite array (A063173) includes the leftmost element of both a zero-only antidiagonal and a zero-only diagonal(A067681).
 * @author Sean A. Irvine
 */
public class A063176 extends IntersectionSequence {

  /** Construct the sequence. */
  public A063176() {
    super(new A063175(), new A063174());
  }
}
