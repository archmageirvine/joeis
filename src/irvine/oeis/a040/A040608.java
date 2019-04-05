package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040608 Continued fraction for sqrt(634).
 * @author Georg Fischer
 */
public class A040608 extends PrependSequence {

  /** Construct the sequence. */
  public A040608() {
    super(new PeriodicSequence(5, 1, 1, 2, 1, 4, 3, 6, 1, 7, 1, 1, 7, 1, 6, 3, 4, 1, 2, 1, 1, 5, 50), Z.valueOf(25));
  }
}
