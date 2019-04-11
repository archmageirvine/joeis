package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A010220 Continued fraction for <code>sqrt(176)</code>.
 * @author Sean A. Irvine
 */
public class A010220 extends PrependSequence {

  /** Construct the sequence. */
  public A010220() {
    super(new PeriodicSequence(3, 1, 3, 26), Z.valueOf(13));
  }
}

