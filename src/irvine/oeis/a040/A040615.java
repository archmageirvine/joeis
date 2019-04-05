package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040615 Continued fraction for sqrt(641).
 * @author Georg Fischer
 */
public class A040615 extends PrependSequence {

  /** Construct the sequence. */
  public A040615() {
    super(new PeriodicSequence(3, 6, 1, 9, 3, 1, 3, 1, 5, 1, 1, 5, 1, 3, 1, 3, 9, 1, 6, 3, 50), Z.valueOf(25));
  }
}
