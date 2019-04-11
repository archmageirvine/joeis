package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A010203 Continued fraction for <code>sqrt(151)</code>.
 * @author Sean A. Irvine
 */
public class A010203 extends PrependSequence {

  /** Construct the sequence. */
  public A010203() {
    super(new PeriodicSequence(3, 2, 7, 1, 3, 4, 1, 1, 1, 11, 1, 1, 1, 4, 3, 1, 7, 2, 3, 24), Z.valueOf(12));
  }
}

