package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040920 Continued fraction for sqrt(951).
 * @author Georg Fischer
 */
public class A040920 extends PrependSequence {

  /** Construct the sequence. */
  public A040920() {
    super(new PeriodicSequence(1, 5, 5, 2, 3, 1, 1, 1, 9, 1, 1, 1, 3, 2, 5, 5, 1, 60), Z.valueOf(30));
  }
}
