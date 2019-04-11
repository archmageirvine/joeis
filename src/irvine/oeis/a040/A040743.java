package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040743 Continued fraction for <code>sqrt(771)</code>.
 * @author Georg Fischer
 */
public class A040743 extends PrependSequence {

  /** Construct the sequence. */
  public A040743() {
    super(new PeriodicSequence(1, 3, 3, 2, 4, 1, 1, 1, 1, 2, 27, 2, 1, 1, 1, 1, 4, 2, 3, 3, 1, 54), Z.valueOf(27));
  }
}
