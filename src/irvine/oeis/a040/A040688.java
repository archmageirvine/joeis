package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040688 Continued fraction for <code>sqrt(715)</code>.
 * @author Georg Fischer
 */
public class A040688 extends PrependSequence {

  /** Construct the sequence. */
  public A040688() {
    super(new PeriodicSequence(1, 2, 1, 5, 5, 5, 1, 2, 1, 52), Z.valueOf(26));
  }
}
