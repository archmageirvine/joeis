package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018341 Divisors of 224.
 * @author Sean A. Irvine
 */
public class A018341 extends FiniteSequence {

  /** Construct the sequence. */
  public A018341() {
    super(Jaguar.factor(224).divisorsSorted());
  }
}
