package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040435 Continued fraction for <code>sqrt(457)</code>.
 * @author Georg Fischer
 */
public class A040435 extends PrependSequence {

  /** Construct the sequence. */
  public A040435() {
    super(new PeriodicSequence(2, 1, 1, 1, 5, 2, 13, 1, 3, 1, 4, 1, 1, 4, 1, 3, 1, 13, 2, 5, 1, 1, 1, 2, 42), Z.valueOf(21));
  }
}
