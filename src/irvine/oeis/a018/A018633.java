package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018633 Divisors of 764.
 * @author Sean A. Irvine
 */
public class A018633 extends FiniteSequence {

  /** Construct the sequence. */
  public A018633() {
    super(Jaguar.factor(764).divisorsSorted());
  }
}
