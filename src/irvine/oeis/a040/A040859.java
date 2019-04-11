package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040859 Continued fraction for <code>sqrt(889)</code>.
 * @author Georg Fischer
 */
public class A040859 extends PrependSequence {

  /** Construct the sequence. */
  public A040859() {
    super(new PeriodicSequence(1, 4, 2, 3, 1, 1, 11, 2, 1, 3, 19, 1, 1, 1, 1, 6, 1, 5, 1, 3, 8, 3, 1, 5, 1, 6, 1, 1, 1, 1, 19, 3, 1, 2, 11, 1, 1, 3, 2, 4, 1, 58), Z.valueOf(29));
  }
}
