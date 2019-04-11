package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040200 Continued fraction for <code>sqrt(215)</code>.
 * @author Georg Fischer
 */
public class A040200 extends PrependSequence {

  /** Construct the sequence. */
  public A040200() {
    super(new PeriodicSequence(1, 1, 1, 28), Z.valueOf(14));
  }
}
