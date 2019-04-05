package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040611 Continued fraction for sqrt(637).
 * @author Georg Fischer
 */
public class A040611 extends PrependSequence {

  /** Construct the sequence. */
  public A040611() {
    super(new PeriodicSequence(4, 5, 2, 1, 3, 1, 1, 12, 16, 1, 2, 1, 16, 12, 1, 1, 3, 1, 2, 5, 4, 50), Z.valueOf(25));
  }
}
