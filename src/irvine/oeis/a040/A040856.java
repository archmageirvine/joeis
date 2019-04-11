package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040856 Continued fraction for <code>sqrt(886)</code>.
 * @author Georg Fischer
 */
public class A040856 extends PrependSequence {

  /** Construct the sequence. */
  public A040856() {
    super(new PeriodicSequence(1, 3, 3, 1, 2, 1, 1, 5, 2, 1, 1, 1, 9, 3, 2, 1, 1, 19, 3, 1, 11, 6, 1, 1, 7, 1, 28, 1, 7, 1, 1, 6, 11, 1, 3, 19, 1, 1, 2, 3, 9, 1, 1, 1, 2, 5, 1, 1, 2, 1, 3, 3, 1, 58), Z.valueOf(29));
  }
}
