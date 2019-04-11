package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040324 Continued fraction for <code>sqrt(343)</code>.
 * @author Georg Fischer
 */
public class A040324 extends PrependSequence {

  /** Construct the sequence. */
  public A040324() {
    super(new PeriodicSequence(1, 1, 11, 1, 5, 3, 1, 17, 1, 3, 5, 1, 11, 1, 1, 36), Z.valueOf(18));
  }
}
