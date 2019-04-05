package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040843 Continued fraction for sqrt(873).
 * @author Georg Fischer
 */
public class A040843 extends PrependSequence {

  /** Construct the sequence. */
  public A040843() {
    super(new PeriodicSequence(1, 1, 4, 1, 6, 1, 1, 3, 6, 3, 1, 1, 6, 1, 4, 1, 1, 58), Z.valueOf(29));
  }
}
