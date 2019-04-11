package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A010151 Continued fraction for <code>sqrt(73)</code>.
 * @author Sean A. Irvine
 */
public class A010151 extends PrependSequence {

  /** Construct the sequence. */
  public A010151() {
    super(new PeriodicSequence(1, 1, 5, 5, 1, 1, 16), Z.EIGHT);
  }
}

