package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040632 Continued fraction for sqrt(658).
 * @author Georg Fischer
 */
public class A040632 extends PrependSequence {

  /** Construct the sequence. */
  public A040632() {
    super(new PeriodicSequence(1, 1, 1, 6, 1, 1, 1, 50), Z.valueOf(25));
  }
}
