package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040197 Continued fraction for <code>sqrt(212)</code>.
 * @author Georg Fischer
 */
public class A040197 extends PrependSequence {

  /** Construct the sequence. */
  public A040197() {
    super(new PeriodicSequence(1, 1, 3, 1, 1, 1, 6, 1, 1, 1, 3, 1, 1, 28), Z.valueOf(14));
  }
}
