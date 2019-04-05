package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040456 Continued fraction for sqrt(478).
 * @author Georg Fischer
 */
public class A040456 extends PrependSequence {

  /** Construct the sequence. */
  public A040456() {
    super(new PeriodicSequence(1, 6, 3, 4, 1, 1, 5, 1, 2, 3, 1, 1, 1, 1, 1, 13, 1, 20, 1, 13, 1, 1, 1, 1, 1, 3, 2, 1, 5, 1, 1, 4, 3, 6, 1, 42), Z.valueOf(21));
  }
}
