package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018711 Divisors of 902.
 * @author Sean A. Irvine
 */
public class A018711 extends FiniteSequence {

  /** Construct the sequence. */
  public A018711() {
    super(Jaguar.factor(902).divisorsSorted());
  }
}
