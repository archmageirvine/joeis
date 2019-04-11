package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040832 Continued fraction for <code>sqrt(862)</code>.
 * @author Georg Fischer
 */
public class A040832 extends PrependSequence {

  /** Construct the sequence. */
  public A040832() {
    super(new PeriodicSequence(2, 1, 3, 1, 1, 9, 4, 2, 2, 2, 1, 5, 1, 4, 2, 19, 8, 2, 1, 28, 1, 2, 8, 19, 2, 4, 1, 5, 1, 2, 2, 2, 4, 9, 1, 1, 3, 1, 2, 58), Z.valueOf(29));
  }
}
