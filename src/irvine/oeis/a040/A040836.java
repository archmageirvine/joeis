package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040836 Continued fraction for sqrt(866).
 * @author Georg Fischer
 */
public class A040836 extends PrependSequence {

  /** Construct the sequence. */
  public A040836() {
    super(new PeriodicSequence(2, 2, 1, 28, 1, 2, 2, 58), Z.valueOf(29));
  }
}
