package irvine.oeis.a065;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a005.A005117;

/**
 * A065301 Both n and the sum of its divisors are squarefree numbers.
 * @author Sean A. Irvine
 */
public class A065301 extends FilterSequence {

  /** Construct the sequence. */
  public A065301() {
    super(1, new A005117(), k -> Jaguar.factor(Functions.SIGMA.z(k)).isSquareFree());
  }
}
