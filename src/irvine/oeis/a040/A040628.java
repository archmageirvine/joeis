package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040628 Continued fraction for <code>sqrt(654)</code>.
 * @author Georg Fischer
 */
public class A040628 extends PrependSequence {

  /** Construct the sequence. */
  public A040628() {
    super(new PeriodicSequence(1, 1, 2, 1, 9, 1, 1, 16, 1, 1, 9, 1, 2, 1, 1, 50), Z.valueOf(25));
  }
}
