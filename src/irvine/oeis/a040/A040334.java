package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040334 Continued fraction for <code>sqrt(353)</code>.
 * @author Georg Fischer
 */
public class A040334 extends PrependSequence {

  /** Construct the sequence. */
  public A040334() {
    super(new PeriodicSequence(1, 3, 1, 2, 1, 1, 1, 1, 1, 1, 2, 1, 3, 1, 36), Z.valueOf(18));
  }
}
