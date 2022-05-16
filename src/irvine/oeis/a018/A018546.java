package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018546 Divisors of 606.
 * @author Sean A. Irvine
 */
public class A018546 extends FiniteSequence {

  /** Construct the sequence. */
  public A018546() {
    super(Jaguar.factor(606).divisorsSorted());
  }
}
