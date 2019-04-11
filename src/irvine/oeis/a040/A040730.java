package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040730 Continued fraction for <code>sqrt(758)</code>.
 * @author Georg Fischer
 */
public class A040730 extends PrependSequence {

  /** Construct the sequence. */
  public A040730() {
    super(new PeriodicSequence(1, 1, 7, 2, 1, 3, 3, 1, 26, 1, 3, 3, 1, 2, 7, 1, 1, 54), Z.valueOf(27));
  }
}
