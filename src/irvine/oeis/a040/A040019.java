package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040019 Continued fraction for <code>sqrt(24)</code>.
 * @author Georg Fischer
 */
public class A040019 extends PrependSequence {

  /** Construct the sequence. */
  public A040019() {
    super(new PeriodicSequence(1, 8), Z.FOUR);
  }
}
