package irvine.oeis.a061;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FilterSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000045;

/**
 * A061305 Squarefree Fibonacci numbers.
 * @author Sean A. Irvine
 */
public class A061305 extends FilterSequence {

  /** Construct the sequence. */
  public A061305() {
    super(new SkipSequence(new A000045(), 1), k -> Jaguar.factor(k).isSquareFree());
  }
}
