package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040732 Continued fraction for sqrt(760).
 * @author Georg Fischer
 */
public class A040732 extends PrependSequence {

  /** Construct the sequence. */
  public A040732() {
    super(new PeriodicSequence(1, 1, 3, 5, 1, 5, 3, 1, 1, 54), Z.valueOf(27));
  }
}
