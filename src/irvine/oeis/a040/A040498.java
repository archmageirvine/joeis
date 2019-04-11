package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040498 Continued fraction for <code>sqrt(521)</code>.
 * @author Georg Fischer
 */
public class A040498 extends PrependSequence {

  /** Construct the sequence. */
  public A040498() {
    super(new PeriodicSequence(1, 4, 1, 2, 1, 2, 8, 1, 3, 3, 1, 8, 2, 1, 2, 1, 4, 1, 44), Z.valueOf(22));
  }
}
