package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040205 Continued fraction for sqrt(220).
 * @author Georg Fischer
 */
public class A040205 extends PrependSequence {

  /** Construct the sequence. */
  public A040205() {
    super(new PeriodicSequence(1, 4, 1, 28), Z.valueOf(14));
  }
}
