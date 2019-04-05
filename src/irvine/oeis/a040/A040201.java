package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040201 Continued fraction for sqrt(216).
 * @author Georg Fischer
 */
public class A040201 extends PrependSequence {

  /** Construct the sequence. */
  public A040201() {
    super(new PeriodicSequence(1, 2, 3, 2, 1, 28), Z.valueOf(14));
  }
}
