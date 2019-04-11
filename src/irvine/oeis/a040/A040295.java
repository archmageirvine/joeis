package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040295 Continued fraction for <code>sqrt(313)</code>.
 * @author Georg Fischer
 */
public class A040295 extends PrependSequence {

  /** Construct the sequence. */
  public A040295() {
    super(new PeriodicSequence(1, 2, 4, 11, 1, 1, 3, 2, 2, 3, 1, 1, 11, 4, 2, 1, 34), Z.valueOf(17));
  }
}
