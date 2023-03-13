package irvine.oeis.a061;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000045;

/**
 * A061899 Fibonacci numbers that are not squarefree.
 * @author Sean A. Irvine
 */
public class A061899 extends FilterSequence {

  /** Construct the sequence. */
  public A061899() {
    super(new A000045(), k -> !Jaguar.factor(k).isSquareFree());
  }
}
