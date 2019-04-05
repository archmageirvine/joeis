package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040198 Continued fraction for sqrt(213).
 * @author Georg Fischer
 */
public class A040198 extends PrependSequence {

  /** Construct the sequence. */
  public A040198() {
    super(new PeriodicSequence(1, 1, 2, 6, 1, 8, 1, 6, 2, 1, 1, 28), Z.valueOf(14));
  }
}
