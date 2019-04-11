package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040631 Continued fraction for <code>sqrt(657)</code>.
 * @author Georg Fischer
 */
public class A040631 extends PrependSequence {

  /** Construct the sequence. */
  public A040631() {
    super(new PeriodicSequence(1, 1, 1, 2, 1, 1, 5, 1, 4, 1, 5, 1, 1, 2, 1, 1, 1, 50), Z.valueOf(25));
  }
}
