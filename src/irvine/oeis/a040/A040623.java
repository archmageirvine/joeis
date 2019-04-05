package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040623 Continued fraction for sqrt(649).
 * @author Georg Fischer
 */
public class A040623 extends PrependSequence {

  /** Construct the sequence. */
  public A040623() {
    super(new PeriodicSequence(2, 9, 1, 2, 3, 1, 1, 2, 1, 4, 1, 16, 6, 3, 4, 3, 6, 16, 1, 4, 1, 2, 1, 1, 3, 2, 1, 9, 2, 50), Z.valueOf(25));
  }
}
