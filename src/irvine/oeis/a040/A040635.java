package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040635 Continued fraction for sqrt(661).
 * @author Georg Fischer
 */
public class A040635 extends PrependSequence {

  /** Construct the sequence. */
  public A040635() {
    super(new PeriodicSequence(1, 2, 2, 4, 4, 16, 1, 9, 2, 1, 12, 5, 1, 1, 1, 2, 1, 3, 1, 1, 3, 1, 2, 1, 1, 1, 5, 12, 1, 2, 9, 1, 16, 4, 4, 2, 2, 1, 50), Z.valueOf(25));
  }
}
