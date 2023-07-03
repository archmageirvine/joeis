package irvine.oeis.a013;

import irvine.oeis.RecordPositionSequence;
import irvine.oeis.a003.A003285;

/**
 * A013645 Values of k at which the period of the continued fraction for sqrt(k) increases.
 * @author Sean A. Irvine
 */
public class A013645 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A013645() {
    super(1, new A003285(), 1);
  }
}
