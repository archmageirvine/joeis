package irvine.oeis.a063;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FilterSequence;
import irvine.oeis.a001.A001274;

/**
 * A063739 Squarefree numbers k such that phi(k) = phi(k+1).
 * @author Sean A. Irvine
 */
public class A063739 extends FilterSequence {

  /** Construct the sequence. */
  public A063739() {
    super(new A001274(), k -> Jaguar.factor(k).isSquareFree());
  }
}
