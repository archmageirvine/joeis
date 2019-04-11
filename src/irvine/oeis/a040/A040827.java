package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040827 Continued fraction for <code>sqrt(857)</code>.
 * @author Georg Fischer
 */
public class A040827 extends PrependSequence {

  /** Construct the sequence. */
  public A040827() {
    super(new PeriodicSequence(3, 1, 1, 1, 3, 1, 6, 1, 1, 6, 1, 3, 1, 1, 1, 3, 58), Z.valueOf(29));
  }
}
