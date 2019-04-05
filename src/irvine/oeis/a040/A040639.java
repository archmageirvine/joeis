package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040639 Continued fraction for sqrt(665).
 * @author Georg Fischer
 */
public class A040639 extends PrependSequence {

  /** Construct the sequence. */
  public A040639() {
    super(new PeriodicSequence(1, 3, 1, 2, 2, 2, 1, 3, 1, 50), Z.valueOf(25));
  }
}
