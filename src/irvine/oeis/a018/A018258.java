package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018258.
 * @author Sean A. Irvine
 */
public class A018258 extends FiniteSequence {

  /** Construct the sequence. */
  public A018258() {
    super(Cheetah.factor(42).divisorsSorted());
  }
}

