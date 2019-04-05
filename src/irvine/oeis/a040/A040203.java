package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040203 Continued fraction for sqrt(218).
 * @author Georg Fischer
 */
public class A040203 extends PrependSequence {

  /** Construct the sequence. */
  public A040203() {
    super(new PeriodicSequence(1, 3, 3, 1, 28), Z.valueOf(14));
  }
}
