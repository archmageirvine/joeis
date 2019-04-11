package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A010159 Continued fraction for <code>sqrt(86)</code>.
 * @author Sean A. Irvine
 */
public class A010159 extends PrependSequence {

  /** Construct the sequence. */
  public A010159() {
    super(new PeriodicSequence(3, 1, 1, 1, 8, 1, 1, 1, 3, 18), Z.NINE);
  }
}

