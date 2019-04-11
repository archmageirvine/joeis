package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040801 Continued fraction for <code>sqrt(830)</code>.
 * @author Georg Fischer
 */
public class A040801 extends PrependSequence {

  /** Construct the sequence. */
  public A040801() {
    super(new PeriodicSequence(1, 4, 3, 1, 10, 1, 3, 4, 1, 56), Z.valueOf(28));
  }
}
