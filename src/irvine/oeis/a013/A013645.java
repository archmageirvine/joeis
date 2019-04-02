package irvine.oeis.a013;

import irvine.oeis.RecordPositionSequence;
import irvine.oeis.a003.A003285;

/**
 * A013645 Values of n at which period of continued fraction for sqrt(n) increases.
 * @author Sean A. Irvine
 */
public class A013645 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A013645() {
    super(new A003285(), 1);
  }
}
