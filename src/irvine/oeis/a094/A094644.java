package irvine.oeis.a094;

import irvine.oeis.a073.A073004;
import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A094644 Continued fraction for e^gamma.
 * @author Sean A. Irvine
 */
public class A094644 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A094644() {
    super(0, new A073004());
  }
}

