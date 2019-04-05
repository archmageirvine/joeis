package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040819 Continued fraction for sqrt(849).
 * @author Georg Fischer
 */
public class A040819 extends PrependSequence {

  /** Construct the sequence. */
  public A040819() {
    super(new PeriodicSequence(7, 3, 1, 2, 1, 7, 1, 1, 2, 4, 11, 2, 2, 1, 18, 1, 2, 2, 11, 4, 2, 1, 1, 7, 1, 2, 1, 3, 7, 58), Z.valueOf(29));
  }
}
