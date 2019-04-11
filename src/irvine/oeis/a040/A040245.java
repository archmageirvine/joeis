package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040245 Continued fraction for <code>sqrt(262)</code>.
 * @author Georg Fischer
 */
public class A040245 extends PrependSequence {

  /** Construct the sequence. */
  public A040245() {
    super(new PeriodicSequence(5, 2, 1, 2, 1, 10, 16, 10, 1, 2, 1, 2, 5, 32), Z.valueOf(16));
  }
}
