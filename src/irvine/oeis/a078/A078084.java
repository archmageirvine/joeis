package irvine.oeis.a078;

import irvine.oeis.a065.A065467;
import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A078084 Continued fraction expansion of Product_{p prime} (1 - 1/(p^4*(p+1))).
 * @author Sean A. Irvine
 */
public class A078084 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A078084() {
    super(0, new A065467());
  }
}

