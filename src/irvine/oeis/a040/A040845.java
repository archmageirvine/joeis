package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040845 Continued fraction for sqrt(875).
 * @author Georg Fischer
 */
public class A040845 extends PrependSequence {

  /** Construct the sequence. */
  public A040845() {
    super(new PeriodicSequence(1, 1, 2, 1, 1, 1, 1, 3, 1, 1, 1, 1, 2, 1, 1, 58), Z.valueOf(29));
  }
}
