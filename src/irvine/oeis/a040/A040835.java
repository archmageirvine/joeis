package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040835 Continued fraction for sqrt(865).
 * @author Georg Fischer
 */
public class A040835 extends PrependSequence {

  /** Construct the sequence. */
  public A040835() {
    super(new PeriodicSequence(2, 2, 3, 3, 1, 1, 1, 2, 6, 6, 2, 1, 1, 1, 3, 3, 2, 2, 58), Z.valueOf(29));
  }
}
