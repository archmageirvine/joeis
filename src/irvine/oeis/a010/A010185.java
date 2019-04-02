package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A010185 Continued fraction for sqrt(124).
 * @author Sean A. Irvine
 */
public class A010185 extends PrependSequence {

  /** Construct the sequence. */
  public A010185() {
    super(new PeriodicSequence(7, 2, 1, 1, 1, 3, 1, 4, 1, 3, 1, 1, 1, 2, 7, 22), Z.valueOf(11));
  }
}

