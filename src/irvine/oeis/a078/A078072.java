package irvine.oeis.a078;

import irvine.oeis.a065.A065485;
import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A078072 Continued fraction for constant defined in A065485.
 * @author Sean A. Irvine
 */
public class A078072 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A078072() {
    super(0, new A065485());
  }
}

