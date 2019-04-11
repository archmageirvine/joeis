package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A010136 Continued fraction for <code>sqrt(46)</code>.
 * @author Sean A. Irvine
 */
public class A010136 extends PrependSequence {

  /** Construct the sequence. */
  public A010136() {
    super(new PeriodicSequence(1, 3, 1, 1, 2, 6, 2, 1, 1, 3, 1, 12), Z.SIX);
  }
}

