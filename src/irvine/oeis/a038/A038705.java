package irvine.oeis.a038;

import irvine.oeis.RecordPositionSequence;
import irvine.oeis.a030.A030167;

/**
 * A038705 Position of the incrementally largest term in continued fraction for Champernowne constant (A030167).
 * @author Sean A. Irvine
 */
public class A038705 extends RecordPositionSequence {

  /**
   * Construct the sequence.
   */
  public A038705() {
    super(new A030167(), 1);
  }
}
