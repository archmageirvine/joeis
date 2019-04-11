package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040694 Continued fraction for <code>sqrt(721)</code>.
 * @author Georg Fischer
 */
public class A040694 extends PrependSequence {

  /** Construct the sequence. */
  public A040694() {
    super(new PeriodicSequence(1, 5, 1, 2, 1, 2, 1, 1, 1, 1, 1, 1, 17, 3, 1, 1, 10, 5, 1, 6, 1, 5, 10, 1, 1, 3, 17, 1, 1, 1, 1, 1, 1, 2, 1, 2, 1, 5, 1, 52), Z.valueOf(26));
  }
}
