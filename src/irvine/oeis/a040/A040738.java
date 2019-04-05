package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040738 Continued fraction for sqrt(766).
 * @author Georg Fischer
 */
public class A040738 extends PrependSequence {

  /** Construct the sequence. */
  public A040738() {
    super(new PeriodicSequence(1, 2, 10, 1, 2, 1, 3, 1, 1, 17, 1, 8, 3, 1, 1, 2, 1, 2, 5, 5, 1, 26, 1, 5, 5, 2, 1, 2, 1, 1, 3, 8, 1, 17, 1, 1, 3, 1, 2, 1, 10, 2, 1, 54), Z.valueOf(27));
  }
}
