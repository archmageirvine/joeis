package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040589 Continued fraction for <code>sqrt(614)</code>.
 * @author Georg Fischer
 */
public class A040589 extends PrependSequence {

  /** Construct the sequence. */
  public A040589() {
    super(new PeriodicSequence(1, 3, 1, 1, 9, 2, 1, 4, 3, 1, 1, 2, 24, 2, 1, 1, 3, 4, 1, 2, 9, 1, 1, 3, 1, 48), Z.valueOf(24));
  }
}
