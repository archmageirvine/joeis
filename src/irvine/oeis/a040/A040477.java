package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040477 Continued fraction for <code>sqrt(500)</code>.
 * @author Georg Fischer
 */
public class A040477 extends PrependSequence {

  /** Construct the sequence. */
  public A040477() {
    super(new PeriodicSequence(2, 1, 3, 2, 1, 1, 10, 1, 1, 2, 3, 1, 2, 44), Z.valueOf(22));
  }
}
