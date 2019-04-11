package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040261 Continued fraction for <code>sqrt(278)</code>.
 * @author Georg Fischer
 */
public class A040261 extends PrependSequence {

  /** Construct the sequence. */
  public A040261() {
    super(new PeriodicSequence(1, 2, 16, 2, 1, 32), Z.valueOf(16));
  }
}
