package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040516 Continued fraction for <code>sqrt(540)</code>.
 * @author Georg Fischer
 */
public class A040516 extends PrependSequence {

  /** Construct the sequence. */
  public A040516() {
    super(new PeriodicSequence(4, 4, 1, 10, 1, 4, 4, 46), Z.valueOf(23));
  }
}
