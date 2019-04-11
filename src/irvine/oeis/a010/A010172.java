package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A010172 Continued fraction for <code>sqrt(106)</code>.
 * @author Sean A. Irvine
 */
public class A010172 extends PrependSequence {

  /** Construct the sequence. */
  public A010172() {
    super(new PeriodicSequence(3, 2, 1, 1, 1, 1, 2, 3, 20), Z.TEN);
  }
}

