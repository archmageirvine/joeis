package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018492 Divisors of 507.
 * @author Sean A. Irvine
 */
public class A018492 extends FiniteSequence {

  /** Construct the sequence. */
  public A018492() {
    super(Cheetah.factor(507).divisorsSorted());
  }
}
