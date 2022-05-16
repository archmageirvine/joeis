package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018744 Divisors of 960.
 * @author Sean A. Irvine
 */
public class A018744 extends FiniteSequence {

  /** Construct the sequence. */
  public A018744() {
    super(Jaguar.factor(960).divisorsSorted());
  }
}
