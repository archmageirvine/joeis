package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040368 Continued fraction for <code>sqrt(388)</code>.
 * @author Georg Fischer
 */
public class A040368 extends PrependSequence {

  /** Construct the sequence. */
  public A040368() {
    super(new PeriodicSequence(1, 2, 3, 4, 12, 1, 8, 1, 12, 4, 3, 2, 1, 38), Z.valueOf(19));
  }
}
