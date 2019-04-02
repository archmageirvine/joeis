package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A010169 Continued fraction for sqrt(98).
 * @author Sean A. Irvine
 */
public class A010169 extends PrependSequence {

  /** Construct the sequence. */
  public A010169() {
    super(new PeriodicSequence(1, 8, 1, 18), Z.NINE);
  }
}

