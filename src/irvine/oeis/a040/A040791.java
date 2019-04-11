package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040791 Continued fraction for <code>sqrt(820)</code>.
 * @author Georg Fischer
 */
public class A040791 extends PrependSequence {

  /** Construct the sequence. */
  public A040791() {
    super(new PeriodicSequence(1, 1, 1, 2, 1, 10, 1, 2, 1, 1, 1, 56), Z.valueOf(28));
  }
}
