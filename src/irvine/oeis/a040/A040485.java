package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040485 Continued fraction for sqrt(508).
 * @author Georg Fischer
 */
public class A040485 extends PrependSequence {

  /** Construct the sequence. */
  public A040485() {
    super(new PeriodicSequence(1, 1, 5, 1, 14, 5, 1, 1, 3, 4, 1, 2, 1, 1, 1, 10, 1, 1, 1, 2, 1, 4, 3, 1, 1, 5, 14, 1, 5, 1, 1, 44), Z.valueOf(22));
  }
}
