package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040823 Continued fraction for <code>sqrt(853)</code>.
 * @author Georg Fischer
 */
public class A040823 extends PrependSequence {

  /** Construct the sequence. */
  public A040823() {
    super(new PeriodicSequence(4, 1, 5, 1, 2, 4, 1, 1, 14, 19, 2, 2, 19, 14, 1, 1, 4, 2, 1, 5, 1, 4, 58), Z.valueOf(29));
  }
}
