package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040265 Continued fraction for sqrt(282).
 * @author Georg Fischer
 */
public class A040265 extends PrependSequence {

  /** Construct the sequence. */
  public A040265() {
    super(new PeriodicSequence(1, 3, 1, 4, 1, 3, 1, 32), Z.valueOf(16));
  }
}
