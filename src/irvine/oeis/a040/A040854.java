package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040854 Continued fraction for sqrt(884).
 * @author Georg Fischer
 */
public class A040854 extends PrependSequence {

  /** Construct the sequence. */
  public A040854() {
    super(new PeriodicSequence(1, 2, 1, 2, 1, 2, 1, 58), Z.valueOf(29));
  }
}
