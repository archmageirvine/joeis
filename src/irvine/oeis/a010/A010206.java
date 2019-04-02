package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A010206 Continued fraction for sqrt(157).
 * @author Sean A. Irvine
 */
public class A010206 extends PrependSequence {

  /** Construct the sequence. */
  public A010206() {
    super(new PeriodicSequence(1, 1, 7, 1, 5, 2, 1, 1, 1, 1, 2, 5, 1, 7, 1, 1, 24), Z.valueOf(12));
  }
}

