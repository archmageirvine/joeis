package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040449 Continued fraction for sqrt(471).
 * @author Georg Fischer
 */
public class A040449 extends PrependSequence {

  /** Construct the sequence. */
  public A040449() {
    super(new PeriodicSequence(1, 2, 2, 1, 3, 4, 14, 4, 3, 1, 2, 2, 1, 42), Z.valueOf(21));
  }
}
