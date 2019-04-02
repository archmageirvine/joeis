package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A010193 Continued fraction for sqrt(134).
 * @author Sean A. Irvine
 */
public class A010193 extends PrependSequence {

  /** Construct the sequence. */
  public A010193() {
    super(new PeriodicSequence(1, 1, 2, 1, 3, 1, 10, 1, 3, 1, 2, 1, 1, 22), Z.valueOf(11));
  }
}

