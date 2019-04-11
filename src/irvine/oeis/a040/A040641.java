package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040641 Continued fraction for <code>sqrt(667)</code>.
 * @author Georg Fischer
 */
public class A040641 extends PrependSequence {

  /** Construct the sequence. */
  public A040641() {
    super(new PeriodicSequence(1, 4, 1, 3, 7, 8, 2, 8, 7, 3, 1, 4, 1, 50), Z.valueOf(25));
  }
}
