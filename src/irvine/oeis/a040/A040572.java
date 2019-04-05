package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040572 Continued fraction for sqrt(597).
 * @author Georg Fischer
 */
public class A040572 extends PrependSequence {

  /** Construct the sequence. */
  public A040572() {
    super(new PeriodicSequence(2, 3, 3, 1, 3, 1, 2, 11, 1, 6, 16, 6, 1, 11, 2, 1, 3, 1, 3, 3, 2, 48), Z.valueOf(24));
  }
}
