package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018747 Divisors of 964.
 * @author Sean A. Irvine
 */
public class A018747 extends FiniteSequence {

  /** Construct the sequence. */
  public A018747() {
    super(Cheetah.factor(964).divisorsSorted());
  }
}
