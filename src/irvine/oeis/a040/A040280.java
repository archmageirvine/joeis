package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040280 Continued fraction for <code>sqrt(298)</code>.
 * @author Georg Fischer
 */
public class A040280 extends PrependSequence {

  /** Construct the sequence. */
  public A040280() {
    super(new PeriodicSequence(3, 1, 4, 5, 1, 1, 5, 4, 1, 3, 34), Z.valueOf(17));
  }
}
