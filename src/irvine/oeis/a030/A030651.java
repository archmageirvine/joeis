package irvine.oeis.a030;

import irvine.oeis.cons.ContinuedFractionSequence;
import irvine.oeis.a073.A073005;

/**
 * A030651 Continued fraction for Gamma(1/3).
 * @author Sean A. Irvine
 */
public class A030651 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A030651() {
    super(new A073005());
  }
}

