package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040831 Continued fraction for <code>sqrt(861)</code>.
 * @author Georg Fischer
 */
public class A040831 extends PrependSequence {

  /** Construct the sequence. */
  public A040831() {
    super(new PeriodicSequence(2, 1, 11, 14, 1, 1, 2, 2, 2, 1, 1, 14, 11, 1, 2, 58), Z.valueOf(29));
  }
}
