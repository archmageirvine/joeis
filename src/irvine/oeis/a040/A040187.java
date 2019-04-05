package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040187 Continued fraction for sqrt(202).
 * @author Georg Fischer
 */
public class A040187 extends PrependSequence {

  /** Construct the sequence. */
  public A040187() {
    super(new PeriodicSequence(4, 1, 2, 2, 1, 4, 28), Z.valueOf(14));
  }
}
