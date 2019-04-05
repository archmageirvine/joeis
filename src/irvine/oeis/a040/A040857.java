package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040857 Continued fraction for sqrt(887).
 * @author Georg Fischer
 */
public class A040857 extends PrependSequence {

  /** Construct the sequence. */
  public A040857() {
    super(new PeriodicSequence(1, 3, 1, 1, 2, 29, 2, 1, 1, 3, 1, 58), Z.valueOf(29));
  }
}
