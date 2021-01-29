package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.RecordSequence;
import irvine.oeis.a030.A030167;

/**
 * A038704 Incrementally largest term in continued fraction for Champernowne constant (A030167).
 * @author Sean A. Irvine
 */
public class A038704 extends RecordSequence {

  /**
   * Construct the sequence.
   */
  public A038704() {
    super(new A030167(), Z.ONE);
  }
}
