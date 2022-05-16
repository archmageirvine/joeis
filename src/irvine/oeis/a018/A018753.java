package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018753 Divisors of 975.
 * @author Sean A. Irvine
 */
public class A018753 extends FiniteSequence {

  /** Construct the sequence. */
  public A018753() {
    super(Jaguar.factor(975).divisorsSorted());
  }
}
