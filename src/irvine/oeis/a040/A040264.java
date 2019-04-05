package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040264 Continued fraction for sqrt(281).
 * @author Georg Fischer
 */
public class A040264 extends PrependSequence {

  /** Construct the sequence. */
  public A040264() {
    super(new PeriodicSequence(1, 3, 4, 1, 1, 6, 6, 1, 1, 4, 3, 1, 32), Z.valueOf(16));
  }
}
