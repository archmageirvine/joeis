package irvine.oeis.a030;

import irvine.oeis.ContinuedFractionSequence;
import irvine.oeis.a073.A073006;

/**
 * A030652 Continued fraction for <code>GAMMA(2/3)</code>.
 * @author Sean A. Irvine
 */
public class A030652 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A030652() {
    super(new A073006());
  }
}

