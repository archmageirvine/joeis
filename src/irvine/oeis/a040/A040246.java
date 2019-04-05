package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040246 Continued fraction for sqrt(263).
 * @author Georg Fischer
 */
public class A040246 extends PrependSequence {

  /** Construct the sequence. */
  public A040246() {
    super(new PeriodicSequence(4, 1, 1, 1, 1, 15, 1, 1, 1, 1, 4, 32), Z.valueOf(16));
  }
}
