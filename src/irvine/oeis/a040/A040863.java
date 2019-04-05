package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040863 Continued fraction for sqrt(893).
 * @author Georg Fischer
 */
public class A040863 extends PrependSequence {

  /** Construct the sequence. */
  public A040863() {
    super(new PeriodicSequence(1, 7, 1, 1, 4, 14, 1, 2, 1, 1, 2, 1, 1, 2, 1, 14, 4, 1, 1, 7, 1, 58), Z.valueOf(29));
  }
}
