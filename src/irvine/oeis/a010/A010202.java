package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A010202 Continued fraction for sqrt(149).
 * @author Sean A. Irvine
 */
public class A010202 extends PrependSequence {

  /** Construct the sequence. */
  public A010202() {
    super(new PeriodicSequence(4, 1, 5, 3, 3, 5, 1, 4, 24), Z.valueOf(12));
  }
}

