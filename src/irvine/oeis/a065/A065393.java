package irvine.oeis.a065;

import irvine.oeis.RecordPositionSequence;

/**
 * A065393 Sigma(phi(m)) - phi(sigma(m)) is increasing at these values of m.
 * @author Sean A. Irvine
 */
public class A065393 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A065393() {
    super(new A065395(), 1, false);
    next();
  }
}
