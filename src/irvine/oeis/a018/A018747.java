package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018747 Divisors of 964.
 * @author Sean A. Irvine
 */
public class A018747 extends FiniteSequence {

  /** Construct the sequence. */
  public A018747() {
    super(Jaguar.factor(964).divisorsSorted());
  }
}
