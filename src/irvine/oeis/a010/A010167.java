package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A010167 Continued fraction for <code>sqrt(96)</code>.
 * @author Sean A. Irvine
 */
public class A010167 extends PrependSequence {

  /** Construct the sequence. */
  public A010167() {
    super(new PeriodicSequence(1, 3, 1, 18), Z.NINE);
  }
}

