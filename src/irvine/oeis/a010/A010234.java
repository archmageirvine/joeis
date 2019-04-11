package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A010234 Continued fraction for <code>sqrt(192)</code>.
 * @author Sean A. Irvine
 */
public class A010234 extends PrependSequence {

  /** Construct the sequence. */
  public A010234() {
    super(new PeriodicSequence(1, 5, 1, 26), Z.valueOf(13));
  }
}

