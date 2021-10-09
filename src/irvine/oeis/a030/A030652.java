package irvine.oeis.a030;

import irvine.oeis.cons.ContinuedFractionSequence;
import irvine.oeis.a073.A073006;

/**
 * A030652 Continued fraction for Gamma(2/3).
 * @author Sean A. Irvine
 */
public class A030652 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A030652() {
    super(new A073006());
  }
}

