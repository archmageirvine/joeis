package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040882 Continued fraction for <code>sqrt(913)</code>.
 * @author Georg Fischer
 */
public class A040882 extends PrependSequence {

  /** Construct the sequence. */
  public A040882() {
    super(new PeriodicSequence(4, 1, 1, 1, 2, 1, 1, 6, 7, 2, 2, 19, 1, 2, 1, 4, 1, 2, 1, 19, 2, 2, 7, 6, 1, 1, 2, 1, 1, 1, 4, 60), Z.valueOf(30));
  }
}
