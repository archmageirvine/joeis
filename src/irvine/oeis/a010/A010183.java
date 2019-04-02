package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A010183 Continued fraction for sqrt(118).
 * @author Sean A. Irvine
 */
public class A010183 extends PrependSequence {

  /** Construct the sequence. */
  public A010183() {
    super(new PeriodicSequence(1, 6, 3, 2, 10, 2, 3, 6, 1, 20), Z.TEN);
  }
}

