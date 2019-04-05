package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040598 Continued fraction for sqrt(623).
 * @author Georg Fischer
 */
public class A040598 extends PrependSequence {

  /** Construct the sequence. */
  public A040598() {
    super(new PeriodicSequence(1, 23, 1, 48), Z.valueOf(24));
  }
}
