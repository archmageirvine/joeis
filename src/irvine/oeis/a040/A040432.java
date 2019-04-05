package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040432 Continued fraction for sqrt(454).
 * @author Georg Fischer
 */
public class A040432 extends PrependSequence {

  /** Construct the sequence. */
  public A040432() {
    super(new PeriodicSequence(3, 3, 1, 13, 2, 3, 2, 1, 1, 4, 6, 1, 7, 1, 1, 1, 20, 1, 1, 1, 7, 1, 6, 4, 1, 1, 2, 3, 2, 13, 1, 3, 3, 42), Z.valueOf(21));
  }
}
