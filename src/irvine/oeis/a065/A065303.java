package irvine.oeis.a065;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a013.A013929;

/**
 * A065303 Neither n nor sigma(n) is squarefree.
 * @author Sean A. Irvine
 */
public class A065303 extends FilterSequence {

  /** Construct the sequence. */
  public A065303() {
    super(1, new A013929(), k -> !Jaguar.factor(Functions.SIGMA.z(k)).isSquareFree());
  }
}
