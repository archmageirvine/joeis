package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040962 Continued fraction for sqrt(994).
 * @author Georg Fischer
 */
public class A040962 extends PrependSequence {

  /** Construct the sequence. */
  public A040962() {
    super(new PeriodicSequence(1, 1, 8, 1, 1, 62), Z.valueOf(31));
  }
}
