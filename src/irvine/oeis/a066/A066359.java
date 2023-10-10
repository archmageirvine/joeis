package irvine.oeis.a066;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FilterSequence;

/**
 * A066359 Nonsquarefree numbers n such that phi(n) = phi(n-2)-phi(n-1), where phi is Euler's totient function.
 * @author Sean A. Irvine
 */
public class A066359 extends FilterSequence {

  /** Construct the sequence. */
  public A066359() {
    super(1, new A066232(), k -> !Jaguar.factor(k).isSquareFree());
  }
}
