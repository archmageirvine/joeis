package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A010217 Continued fraction for <code>sqrt(173)</code>.
 * @author Sean A. Irvine
 */
public class A010217 extends PrependSequence {

  /** Construct the sequence. */
  public A010217() {
    super(new PeriodicSequence(6, 1, 1, 6, 26), Z.valueOf(13));
  }
}

