package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040439 Continued fraction for <code>sqrt(461)</code>.
 * @author Georg Fischer
 */
public class A040439 extends PrependSequence {

  /** Construct the sequence. */
  public A040439() {
    super(new PeriodicSequence(2, 8, 10, 1, 1, 1, 1, 1, 1, 1, 1, 10, 8, 2, 42), Z.valueOf(21));
  }
}
