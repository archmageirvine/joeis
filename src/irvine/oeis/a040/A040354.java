package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040354 Continued fraction for <code>sqrt(374)</code>.
 * @author Georg Fischer
 */
public class A040354 extends PrependSequence {

  /** Construct the sequence. */
  public A040354() {
    super(new PeriodicSequence(2, 1, 18, 1, 2, 38), Z.valueOf(19));
  }
}
