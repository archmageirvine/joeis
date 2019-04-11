package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040267 Continued fraction for <code>sqrt(284)</code>.
 * @author Georg Fischer
 */
public class A040267 extends PrependSequence {

  /** Construct the sequence. */
  public A040267() {
    super(new PeriodicSequence(1, 5, 1, 3, 2, 1, 4, 8, 4, 1, 2, 3, 1, 5, 1, 32), Z.valueOf(16));
  }
}
