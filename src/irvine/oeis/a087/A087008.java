package irvine.oeis.a087;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.FiniteSequence;

/**
 * A087008 Divisors of 9699690.
 * @author Sean A. Irvine
 */
public class A087008 extends FiniteSequence {

  /** Construct the sequence. */
  public A087008() {
    super(Jaguar.factor(Z.valueOf(9699690L)).divisorsSorted());
  }
}
