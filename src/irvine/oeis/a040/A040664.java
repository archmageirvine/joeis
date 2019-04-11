package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040664 Continued fraction for <code>sqrt(691)</code>.
 * @author Georg Fischer
 */
public class A040664 extends PrependSequence {

  /** Construct the sequence. */
  public A040664() {
    super(new PeriodicSequence(3, 2, 17, 10, 2, 5, 2, 1, 2, 1, 4, 1, 1, 8, 4, 1, 1, 1, 25, 1, 1, 1, 4, 8, 1, 1, 4, 1, 2, 1, 2, 5, 2, 10, 17, 2, 3, 52), Z.valueOf(26));
  }
}
