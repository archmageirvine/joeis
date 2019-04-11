package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040636 Continued fraction for <code>sqrt(662)</code>.
 * @author Georg Fischer
 */
public class A040636 extends PrependSequence {

  /** Construct the sequence. */
  public A040636() {
    super(new PeriodicSequence(1, 2, 1, 2, 3, 1, 1, 2, 6, 1, 24, 1, 6, 2, 1, 1, 3, 2, 1, 2, 1, 50), Z.valueOf(25));
  }
}
