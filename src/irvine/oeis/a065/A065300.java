package irvine.oeis.a065;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a000.A000203;

/**
 * A065300 Numbers k such that the sum of divisors of k is a squarefree number.
 * @author Sean A. Irvine
 */
public class A065300 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A065300() {
    super(1, new A000203(), k -> Jaguar.factor(k).isSquareFree());
  }
}
