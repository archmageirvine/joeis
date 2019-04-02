package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A010211 Continued fraction for sqrt(162).
 * @author Sean A. Irvine
 */
public class A010211 extends PrependSequence {

  /** Construct the sequence. */
  public A010211() {
    super(new PeriodicSequence(1, 2, 1, 2, 12, 2, 1, 2, 1, 24), Z.valueOf(12));
  }
}

