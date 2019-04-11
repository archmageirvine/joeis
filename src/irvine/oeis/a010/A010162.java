package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A010162 Continued fraction for <code>sqrt(91)</code>.
 * @author Sean A. Irvine
 */
public class A010162 extends PrependSequence {

  /** Construct the sequence. */
  public A010162() {
    super(new PeriodicSequence(1, 1, 5, 1, 5, 1, 1, 18), Z.NINE);
  }
}

