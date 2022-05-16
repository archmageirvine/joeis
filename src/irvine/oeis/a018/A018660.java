package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018660 Divisors of 812.
 * @author Sean A. Irvine
 */
public class A018660 extends FiniteSequence {

  /** Construct the sequence. */
  public A018660() {
    super(Jaguar.factor(812).divisorsSorted());
  }
}
