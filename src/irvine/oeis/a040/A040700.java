package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040700 Continued fraction for <code>sqrt(727)</code>.
 * @author Georg Fischer
 */
public class A040700 extends PrependSequence {

  /** Construct the sequence. */
  public A040700() {
    super(new PeriodicSequence(1, 25, 1, 52), Z.valueOf(26));
  }
}
