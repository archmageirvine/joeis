package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040850 Continued fraction for sqrt(880).
 * @author Georg Fischer
 */
public class A040850 extends PrependSequence {

  /** Construct the sequence. */
  public A040850() {
    super(new PeriodicSequence(1, 1, 1, 58), Z.valueOf(29));
  }
}
