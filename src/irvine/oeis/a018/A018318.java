package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018318 Divisors of 174.
 * @author Sean A. Irvine
 */
public class A018318 extends FiniteSequence {

  /** Construct the sequence. */
  public A018318() {
    super(Jaguar.factor(174).divisorsSorted());
  }
}
