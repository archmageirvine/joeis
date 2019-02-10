package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018262.
 * @author Sean A. Irvine
 */
public class A018262 extends FiniteSequence {

  /** Construct the sequence. */
  public A018262() {
    super(Cheetah.factor(50).divisorsSorted());
  }
}

