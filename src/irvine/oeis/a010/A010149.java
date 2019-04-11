package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A010149 Continued fraction for <code>sqrt(70)</code>.
 * @author Sean A. Irvine
 */
public class A010149 extends PrependSequence {

  /** Construct the sequence. */
  public A010149() {
    super(new PeriodicSequence(2, 1, 2, 1, 2, 16), Z.EIGHT);
  }
}

