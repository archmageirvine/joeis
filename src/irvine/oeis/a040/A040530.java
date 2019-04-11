package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040530 Continued fraction for <code>sqrt(554)</code>.
 * @author Georg Fischer
 */
public class A040530 extends PrependSequence {

  /** Construct the sequence. */
  public A040530() {
    super(new PeriodicSequence(1, 1, 6, 4, 1, 1, 4, 6, 1, 1, 46), Z.valueOf(23));
  }
}
