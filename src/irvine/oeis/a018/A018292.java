package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018292 Divisors of 117.
 * @author Sean A. Irvine
 */
public class A018292 extends FiniteSequence {

  /** Construct the sequence. */
  public A018292() {
    super(Cheetah.factor(117).divisorsSorted());
  }
}
