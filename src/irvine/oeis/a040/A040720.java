package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040720 Continued fraction for sqrt(748).
 * @author Georg Fischer
 */
public class A040720 extends PrependSequence {

  /** Construct the sequence. */
  public A040720() {
    super(new PeriodicSequence(2, 1, 6, 5, 1, 12, 1, 5, 6, 1, 2, 54), Z.valueOf(27));
  }
}
