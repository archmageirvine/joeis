package irvine.oeis.a061;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000217;

/**
 * A061900 Triangular numbers that are not squarefree.
 * @author Sean A. Irvine
 */
public class A061900 extends FilterSequence {

  /** Construct the sequence. */
  public A061900() {
    super(1, new A000217(), k -> !Jaguar.factor(k).isSquareFree());
  }
}
