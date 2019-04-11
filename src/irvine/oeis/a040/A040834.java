package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040834 Continued fraction for <code>sqrt(864)</code>.
 * @author Georg Fischer
 */
public class A040834 extends PrependSequence {

  /** Construct the sequence. */
  public A040834() {
    super(new PeriodicSequence(2, 1, 1, 5, 1, 13, 1, 5, 1, 1, 2, 58), Z.valueOf(29));
  }
}
