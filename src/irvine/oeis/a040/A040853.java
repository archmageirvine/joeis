package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040853 Continued fraction for <code>sqrt(883)</code>.
 * @author Georg Fischer
 */
public class A040853 extends PrependSequence {

  /** Construct the sequence. */
  public A040853() {
    super(new PeriodicSequence(1, 2, 1, 1, 19, 4, 5, 6, 2, 2, 2, 1, 2, 1, 1, 2, 8, 9, 1, 3, 1, 2, 29, 2, 1, 3, 1, 9, 8, 2, 1, 1, 2, 1, 2, 2, 2, 6, 5, 4, 19, 1, 1, 2, 1, 58), Z.valueOf(29));
  }
}
