package irvine.oeis.a065;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a005.A005117;

/**
 * A065302 Squarefree composite numbers whose sum of divisors is also squarefree.
 * @author Sean A. Irvine
 */
public class A065302 extends FilterSequence {

  /** Construct the sequence. */
  public A065302() {
    super(1, new A005117(), k -> !k.isProbablePrime() && Jaguar.factor(Functions.SIGMA1.z(k)).isSquareFree());
  }
}
