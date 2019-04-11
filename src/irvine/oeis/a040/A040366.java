package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040366 Continued fraction for <code>sqrt(386)</code>.
 * @author Georg Fischer
 */
public class A040366 extends PrependSequence {

  /** Construct the sequence. */
  public A040366() {
    super(new PeriodicSequence(1, 1, 1, 4, 1, 18, 1, 4, 1, 1, 1, 38), Z.valueOf(19));
  }
}
