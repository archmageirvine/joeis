package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040284 Continued fraction for <code>sqrt(302)</code>.
 * @author Georg Fischer
 */
public class A040284 extends PrependSequence {

  /** Construct the sequence. */
  public A040284() {
    super(new PeriodicSequence(2, 1, 1, 1, 4, 2, 1, 16, 1, 2, 4, 1, 1, 1, 2, 34), Z.valueOf(17));
  }
}
