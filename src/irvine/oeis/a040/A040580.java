package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040580 Continued fraction for <code>sqrt(605)</code>.
 * @author Georg Fischer
 */
public class A040580 extends PrependSequence {

  /** Construct the sequence. */
  public A040580() {
    super(new PeriodicSequence(1, 1, 2, 11, 1, 8, 1, 11, 2, 1, 1, 48), Z.valueOf(24));
  }
}
