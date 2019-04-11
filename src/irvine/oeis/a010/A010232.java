package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A010232 Continued fraction for <code>sqrt(190)</code>.
 * @author Sean A. Irvine
 */
public class A010232 extends PrependSequence {

  /** Construct the sequence. */
  public A010232() {
    super(new PeriodicSequence(1, 3, 1, 1, 1, 2, 2, 2, 1, 1, 1, 3, 1, 26), Z.valueOf(13));
  }
}

