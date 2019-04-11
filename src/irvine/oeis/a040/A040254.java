package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040254 Continued fraction for <code>sqrt(271)</code>.
 * @author Georg Fischer
 */
public class A040254 extends PrependSequence {

  /** Construct the sequence. */
  public A040254() {
    super(new PeriodicSequence(2, 6, 10, 1, 4, 1, 1, 2, 1, 2, 1, 15, 1, 2, 1, 2, 1, 1, 4, 1, 10, 6, 2, 32), Z.valueOf(16));
  }
}
