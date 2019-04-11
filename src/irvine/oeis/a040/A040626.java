package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040626 Continued fraction for <code>sqrt(652)</code>.
 * @author Georg Fischer
 */
public class A040626 extends PrependSequence {

  /** Construct the sequence. */
  public A040626() {
    super(new PeriodicSequence(1, 1, 6, 1, 3, 1, 3, 2, 5, 1, 16, 5, 1, 1, 1, 1, 2, 12, 2, 1, 1, 1, 1, 5, 16, 1, 5, 2, 3, 1, 3, 1, 6, 1, 1, 50), Z.valueOf(25));
  }
}
