package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040666 Continued fraction for <code>sqrt(693)</code>.
 * @author Georg Fischer
 */
public class A040666 extends PrependSequence {

  /** Construct the sequence. */
  public A040666() {
    super(new PeriodicSequence(3, 12, 1, 4, 1, 12, 3, 52), Z.valueOf(26));
  }
}
