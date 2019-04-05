package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040574 Continued fraction for sqrt(599).
 * @author Georg Fischer
 */
public class A040574 extends PrependSequence {

  /** Construct the sequence. */
  public A040574() {
    super(new PeriodicSequence(2, 9, 3, 2, 1, 1, 3, 1, 6, 4, 1, 2, 1, 23, 1, 2, 1, 4, 6, 1, 3, 1, 1, 2, 3, 9, 2, 48), Z.valueOf(24));
  }
}
