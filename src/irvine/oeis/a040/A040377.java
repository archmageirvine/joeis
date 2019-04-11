package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040377 Continued fraction for <code>sqrt(397)</code>.
 * @author Georg Fischer
 */
public class A040377 extends PrependSequence {

  /** Construct the sequence. */
  public A040377() {
    super(new PeriodicSequence(1, 12, 3, 4, 9, 1, 2, 1, 2, 1, 1, 2, 1, 2, 1, 9, 4, 3, 12, 1, 38), Z.valueOf(19));
  }
}
