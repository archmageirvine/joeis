package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040365 Continued fraction for sqrt(385).
 * @author Georg Fischer
 */
public class A040365 extends PrependSequence {

  /** Construct the sequence. */
  public A040365() {
    super(new PeriodicSequence(1, 1, 1, 1, 1, 3, 1, 2, 1, 3, 1, 1, 1, 1, 1, 38), Z.valueOf(19));
  }
}
