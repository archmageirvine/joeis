package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040500 Continued fraction for <code>sqrt(523)</code>.
 * @author Georg Fischer
 */
public class A040500 extends PrependSequence {

  /** Construct the sequence. */
  public A040500() {
    super(new PeriodicSequence(1, 6, 1, 1, 1, 4, 2, 3, 14, 1, 21, 1, 14, 3, 2, 4, 1, 1, 1, 6, 1, 44), Z.valueOf(22));
  }
}
