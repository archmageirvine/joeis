package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040202 Continued fraction for <code>sqrt(217)</code>.
 * @author Georg Fischer
 */
public class A040202 extends PrependSequence {

  /** Construct the sequence. */
  public A040202() {
    super(new PeriodicSequence(1, 2, 1, 2, 1, 1, 9, 4, 9, 1, 1, 2, 1, 2, 1, 28), Z.valueOf(14));
  }
}
