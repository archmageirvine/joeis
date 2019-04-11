package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A010229 Continued fraction for <code>sqrt(187)</code>.
 * @author Sean A. Irvine
 */
public class A010229 extends PrependSequence {

  /** Construct the sequence. */
  public A010229() {
    super(new PeriodicSequence(1, 2, 13, 2, 1, 26), Z.valueOf(13));
  }
}

