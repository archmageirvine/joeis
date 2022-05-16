package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018685 Divisors of 855.
 * @author Sean A. Irvine
 */
public class A018685 extends FiniteSequence {

  /** Construct the sequence. */
  public A018685() {
    super(Jaguar.factor(855).divisorsSorted());
  }
}
