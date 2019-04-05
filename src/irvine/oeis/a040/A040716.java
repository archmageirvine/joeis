package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040716 Continued fraction for sqrt(744).
 * @author Georg Fischer
 */
public class A040716 extends PrependSequence {

  /** Construct the sequence. */
  public A040716() {
    super(new PeriodicSequence(3, 1, 1, 1, 1, 1, 1, 1, 3, 54), Z.valueOf(27));
  }
}
