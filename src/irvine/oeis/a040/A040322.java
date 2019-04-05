package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040322 Continued fraction for sqrt(341).
 * @author Georg Fischer
 */
public class A040322 extends PrependSequence {

  /** Construct the sequence. */
  public A040322() {
    super(new PeriodicSequence(2, 6, 1, 8, 2, 1, 2, 1, 2, 8, 1, 6, 2, 36), Z.valueOf(18));
  }
}
