package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040826 Continued fraction for <code>sqrt(856)</code>.
 * @author Georg Fischer
 */
public class A040826 extends PrependSequence {

  /** Construct the sequence. */
  public A040826() {
    super(new PeriodicSequence(3, 1, 7, 1, 1, 1, 1, 4, 3, 1, 2, 6, 7, 6, 2, 1, 3, 4, 1, 1, 1, 1, 7, 1, 3, 58), Z.valueOf(29));
  }
}
