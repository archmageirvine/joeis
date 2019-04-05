package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040847 Continued fraction for sqrt(877).
 * @author Georg Fischer
 */
public class A040847 extends PrependSequence {

  /** Construct the sequence. */
  public A040847() {
    super(new PeriodicSequence(1, 1, 1, 1, 2, 4, 1, 1, 4, 2, 1, 1, 1, 1, 58), Z.valueOf(29));
  }
}
