package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040829 Continued fraction for <code>sqrt(859)</code>.
 * @author Georg Fischer
 */
public class A040829 extends PrependSequence {

  /** Construct the sequence. */
  public A040829() {
    super(new PeriodicSequence(3, 4, 5, 1, 1, 1, 2, 2, 3, 2, 19, 9, 1, 2, 1, 1, 4, 1, 3, 11, 2, 6, 29, 6, 2, 11, 3, 1, 4, 1, 1, 2, 1, 9, 19, 2, 3, 2, 2, 1, 1, 1, 5, 4, 3, 58), Z.valueOf(29));
  }
}
