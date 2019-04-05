package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040640 Continued fraction for sqrt(666).
 * @author Georg Fischer
 */
public class A040640 extends PrependSequence {

  /** Construct the sequence. */
  public A040640() {
    super(new PeriodicSequence(1, 4, 5, 1, 1, 6, 1, 4, 1, 6, 1, 1, 5, 4, 1, 50), Z.valueOf(25));
  }
}
