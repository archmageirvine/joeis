package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A010170 Continued fraction for <code>sqrt(99)</code>.
 * @author Sean A. Irvine
 */
public class A010170 extends PrependSequence {

  /** Construct the sequence. */
  public A010170() {
    super(new PeriodicSequence(1, 18), Z.NINE);
  }
}

