package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040244 Continued fraction for <code>sqrt(261)</code>.
 * @author Georg Fischer
 */
public class A040244 extends PrependSequence {

  /** Construct the sequence. */
  public A040244() {
    super(new PeriodicSequence(6, 2, 3, 7, 1, 3, 1, 2, 1, 3, 1, 7, 3, 2, 6, 32), Z.valueOf(16));
  }
}
