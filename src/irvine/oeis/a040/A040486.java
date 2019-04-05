package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040486 Continued fraction for sqrt(509).
 * @author Georg Fischer
 */
public class A040486 extends PrependSequence {

  /** Construct the sequence. */
  public A040486() {
    super(new PeriodicSequence(1, 1, 3, 1, 1, 2, 10, 1, 8, 8, 1, 10, 2, 1, 1, 3, 1, 1, 44), Z.valueOf(22));
  }
}
