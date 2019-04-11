package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A010168 Continued fraction for <code>sqrt(97)</code>.
 * @author Sean A. Irvine
 */
public class A010168 extends PrependSequence {

  /** Construct the sequence. */
  public A010168() {
    super(new PeriodicSequence(1, 5, 1, 1, 1, 1, 1, 1, 5, 1, 18), Z.NINE);
  }
}

