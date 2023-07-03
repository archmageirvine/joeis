package irvine.oeis.a039;

import irvine.oeis.a160.A160331;
import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A039923 Continued fraction for 2^(1/3) + sqrt(3).
 * @author Sean A. Irvine
 */
public class A039923 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A039923() {
    super(0, new A160331());
  }
}
