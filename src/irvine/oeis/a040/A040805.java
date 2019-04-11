package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040805 Continued fraction for <code>sqrt(834)</code>.
 * @author Georg Fischer
 */
public class A040805 extends PrependSequence {

  /** Construct the sequence. */
  public A040805() {
    super(new PeriodicSequence(1, 7, 3, 1, 2, 1, 1, 1, 3, 2, 28, 2, 3, 1, 1, 1, 2, 1, 3, 7, 1, 56), Z.valueOf(28));
  }
}
