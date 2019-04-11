package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040714 Continued fraction for <code>sqrt(742)</code>.
 * @author Georg Fischer
 */
public class A040714 extends PrependSequence {

  /** Construct the sequence. */
  public A040714() {
    super(new PeriodicSequence(4, 5, 1, 4, 8, 1, 6, 1, 8, 4, 1, 5, 4, 54), Z.valueOf(27));
  }
}
