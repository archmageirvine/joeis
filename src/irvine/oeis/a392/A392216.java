package irvine.oeis.a392;

import irvine.oeis.a202.A202142;
import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A392216 Continued fraction expansion of 4/sqrt(phi) = A202142, where phi = (1 + sqrt(5)) / 2 is the golden ratio.
 * @author Sean A. Irvine
 */
public class A392216 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A392216() {
    super(0, new A202142());
  }
}

