package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040260 Continued fraction for sqrt(277).
 * @author Georg Fischer
 */
public class A040260 extends PrependSequence {

  /** Construct the sequence. */
  public A040260() {
    super(new PeriodicSequence(1, 1, 1, 4, 10, 1, 7, 2, 2, 3, 3, 2, 2, 7, 1, 10, 4, 1, 1, 1, 32), Z.valueOf(16));
  }
}
