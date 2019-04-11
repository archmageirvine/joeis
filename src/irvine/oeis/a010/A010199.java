package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A010199 Continued fraction for <code>sqrt(140)</code>.
 * @author Sean A. Irvine
 */
public class A010199 extends PrependSequence {

  /** Construct the sequence. */
  public A010199() {
    super(new PeriodicSequence(1, 4, 1, 22), Z.valueOf(11));
  }
}

