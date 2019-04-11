package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040480 Continued fraction for <code>sqrt(503)</code>.
 * @author Georg Fischer
 */
public class A040480 extends PrependSequence {

  /** Construct the sequence. */
  public A040480() {
    super(new PeriodicSequence(2, 2, 1, 21, 1, 2, 2, 44), Z.valueOf(22));
  }
}
