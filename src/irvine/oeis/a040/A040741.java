package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040741 Continued fraction for sqrt(769).
 * @author Georg Fischer
 */
public class A040741 extends PrependSequence {

  /** Construct the sequence. */
  public A040741() {
    super(new PeriodicSequence(1, 2, 1, 2, 1, 1, 17, 1, 10, 6, 1, 5, 3, 3, 2, 1, 1, 1, 1, 1, 1, 2, 3, 3, 5, 1, 6, 10, 1, 17, 1, 1, 2, 1, 2, 1, 54), Z.valueOf(27));
  }
}
