package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040913 Continued fraction for <code>sqrt(944)</code>.
 * @author Georg Fischer
 */
public class A040913 extends PrependSequence {

  /** Construct the sequence. */
  public A040913() {
    super(new PeriodicSequence(1, 2, 1, 1, 1, 2, 2, 3, 2, 2, 1, 1, 1, 2, 1, 60), Z.valueOf(30));
  }
}
