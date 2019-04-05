package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040459 Continued fraction for sqrt(481).
 * @author Georg Fischer
 */
public class A040459 extends PrependSequence {

  /** Construct the sequence. */
  public A040459() {
    super(new PeriodicSequence(1, 13, 1, 1, 1, 4, 4, 1, 1, 1, 13, 1, 42), Z.valueOf(21));
  }
}
