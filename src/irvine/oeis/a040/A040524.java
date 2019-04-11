package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040524 Continued fraction for <code>sqrt(548)</code>.
 * @author Georg Fischer
 */
public class A040524 extends PrependSequence {

  /** Construct the sequence. */
  public A040524() {
    super(new PeriodicSequence(2, 2, 3, 1, 5, 1, 10, 1, 5, 1, 3, 2, 2, 46), Z.valueOf(23));
  }
}
