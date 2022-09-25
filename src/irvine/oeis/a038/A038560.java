package irvine.oeis.a038;

import irvine.oeis.Combiner;
import irvine.oeis.a032.A032347;

/**
 * A038560 Binomial recurrence coefficients.
 * @author Sean A. Irvine
 */
public class A038560 extends Combiner {

  /** Construct the sequence. */
  public A038560() {
    super(new A038559(), new A032347(), ADD);
  }
}
