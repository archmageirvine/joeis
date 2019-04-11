package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040517 Continued fraction for <code>sqrt(541)</code>.
 * @author Georg Fischer
 */
public class A040517 extends PrependSequence {

  /** Construct the sequence. */
  public A040517() {
    super(new PeriodicSequence(3, 1, 5, 1, 8, 2, 4, 1, 2, 3, 1, 1, 11, 15, 2, 2, 1, 1, 1, 1, 1, 1, 2, 2, 15, 11, 1, 1, 3, 2, 1, 4, 2, 8, 1, 5, 1, 3, 46), Z.valueOf(23));
  }
}
