package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040266 Continued fraction for sqrt(283).
 * @author Georg Fischer
 */
public class A040266 extends PrependSequence {

  /** Construct the sequence. */
  public A040266() {
    super(new PeriodicSequence(1, 4, 1, 1, 1, 3, 10, 1, 15, 1, 10, 3, 1, 1, 1, 4, 1, 32), Z.valueOf(16));
  }
}
