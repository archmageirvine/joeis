package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040441 Continued fraction for <code>sqrt(463)</code>.
 * @author Georg Fischer
 */
public class A040441 extends PrependSequence {

  /** Construct the sequence. */
  public A040441() {
    super(new PeriodicSequence(1, 1, 13, 1, 5, 4, 1, 1, 1, 1, 2, 2, 6, 1, 3, 21, 3, 1, 6, 2, 2, 1, 1, 1, 1, 4, 5, 1, 13, 1, 1, 42), Z.valueOf(21));
  }
}
