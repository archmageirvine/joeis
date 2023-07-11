package irvine.oeis.a063;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000032;

/**
 * A063509 Squarefree Lucas numbers.
 * @author Sean A. Irvine
 */
public class A063509 extends FilterSequence {

  /** Construct the sequence. */
  public A063509() {
    super(0, new A000032(), k -> Jaguar.factor(k).isSquareFree());
  }
}
