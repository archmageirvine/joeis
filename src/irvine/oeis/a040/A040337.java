package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040337 Continued fraction for <code>sqrt(356)</code>.
 * @author Georg Fischer
 */
public class A040337 extends PrependSequence {

  /** Construct the sequence. */
  public A040337() {
    super(new PeriodicSequence(1, 6, 1, 1, 2, 1, 8, 1, 2, 1, 1, 6, 1, 36), Z.valueOf(18));
  }
}
