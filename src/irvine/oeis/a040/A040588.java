package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040588 Continued fraction for <code>sqrt(613)</code>.
 * @author Georg Fischer
 */
public class A040588 extends PrependSequence {

  /** Construct the sequence. */
  public A040588() {
    super(new PeriodicSequence(1, 3, 6, 1, 4, 1, 1, 1, 3, 2, 11, 1, 15, 1, 1, 2, 2, 1, 1, 15, 1, 11, 2, 3, 1, 1, 1, 4, 1, 6, 3, 1, 48), Z.valueOf(24));
  }
}
