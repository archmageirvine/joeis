package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A010208 Continued fraction for <code>sqrt(159)</code>.
 * @author Sean A. Irvine
 */
public class A010208 extends PrependSequence {

  /** Construct the sequence. */
  public A010208() {
    super(new PeriodicSequence(1, 1, 1, 1, 3, 1, 1, 1, 1, 24), Z.valueOf(12));
  }
}

