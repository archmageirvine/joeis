package irvine.oeis.a081;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.FiniteSequence;

/**
 * A081110 Divisors of 2^60 - 1.
 * @author Sean A. Irvine
 */
public class A081110 extends FiniteSequence {

  /** Construct the sequence. */
  public A081110() {
    super(Jaguar.factor(Z.ONE.shiftLeft(60).subtract(1)).divisorsSorted());
  }
}

