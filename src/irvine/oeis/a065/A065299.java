package irvine.oeis.a065;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a062.A062354;

/**
 * A065299 Numbers k such that sigma(k)*phi(k) is squarefree.
 * @author Sean A. Irvine
 */
public class A065299 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A065299() {
    super(1, new A062354(), k -> Jaguar.factor(k).isSquareFree());
  }
}
