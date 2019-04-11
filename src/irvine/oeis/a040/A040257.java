package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040257 Continued fraction for <code>sqrt(274)</code>.
 * @author Georg Fischer
 */
public class A040257 extends PrependSequence {

  /** Construct the sequence. */
  public A040257() {
    super(new PeriodicSequence(1, 1, 4, 4, 1, 1, 32), Z.valueOf(16));
  }
}
