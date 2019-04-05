package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040192 Continued fraction for sqrt(207).
 * @author Georg Fischer
 */
public class A040192 extends PrependSequence {

  /** Construct the sequence. */
  public A040192() {
    super(new PeriodicSequence(2, 1, 1, 2, 1, 1, 2, 28), Z.valueOf(14));
  }
}
