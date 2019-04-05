package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040595 Continued fraction for sqrt(620).
 * @author Georg Fischer
 */
public class A040595 extends PrependSequence {

  /** Construct the sequence. */
  public A040595() {
    super(new PeriodicSequence(1, 8, 1, 48), Z.valueOf(24));
  }
}
