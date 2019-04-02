package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A010138 Continued fraction for sqrt(52).
 * @author Sean A. Irvine
 */
public class A010138 extends PrependSequence {

  /** Construct the sequence. */
  public A010138() {
    super(new PeriodicSequence(4, 1, 2, 1, 4, 14), Z.SEVEN);
  }
}

