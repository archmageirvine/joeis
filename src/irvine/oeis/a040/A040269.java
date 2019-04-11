package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040269 Continued fraction for <code>sqrt(286)</code>.
 * @author Georg Fischer
 */
public class A040269 extends PrependSequence {

  /** Construct the sequence. */
  public A040269() {
    super(new PeriodicSequence(1, 10, 3, 3, 2, 3, 3, 10, 1, 32), Z.valueOf(16));
  }
}
