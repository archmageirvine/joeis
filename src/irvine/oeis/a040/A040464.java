package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040464 Continued fraction for <code>sqrt(487)</code>.
 * @author Georg Fischer
 */
public class A040464 extends PrependSequence {

  /** Construct the sequence. */
  public A040464() {
    super(new PeriodicSequence(14, 1, 2, 4, 1, 1, 3, 2, 5, 1, 6, 1, 1, 21, 1, 1, 6, 1, 5, 2, 3, 1, 1, 4, 2, 1, 14, 44), Z.valueOf(22));
  }
}
