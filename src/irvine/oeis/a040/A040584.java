package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040584 Continued fraction for <code>sqrt(609)</code>.
 * @author Georg Fischer
 */
public class A040584 extends PrependSequence {

  /** Construct the sequence. */
  public A040584() {
    super(new PeriodicSequence(1, 2, 9, 1, 1, 6, 1, 1, 9, 2, 1, 48), Z.valueOf(24));
  }
}
