package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A010225 Continued fraction for <code>sqrt(183)</code>.
 * @author Sean A. Irvine
 */
public class A010225 extends PrependSequence {

  /** Construct the sequence. */
  public A010225() {
    super(new PeriodicSequence(1, 1, 8, 1, 1, 26), Z.valueOf(13));
  }
}

