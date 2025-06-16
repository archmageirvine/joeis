package irvine.oeis.a078;

import irvine.oeis.a065.A065483;
import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A078074 Continued fraction for constant defined in A065483.
 * @author Sean A. Irvine
 */
public class A078074 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A078074() {
    super(0, new A065483());
  }
}

