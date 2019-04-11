package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040347 Continued fraction for <code>sqrt(367)</code>.
 * @author Georg Fischer
 */
public class A040347 extends PrependSequence {

  /** Construct the sequence. */
  public A040347() {
    super(new PeriodicSequence(6, 2, 1, 3, 1, 1, 2, 1, 12, 19, 12, 1, 2, 1, 1, 3, 1, 2, 6, 38), Z.valueOf(19));
  }
}
