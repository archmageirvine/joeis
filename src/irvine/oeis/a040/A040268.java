package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040268 Continued fraction for <code>sqrt(285)</code>.
 * @author Georg Fischer
 */
public class A040268 extends PrependSequence {

  /** Construct the sequence. */
  public A040268() {
    super(new PeriodicSequence(1, 7, 2, 7, 1, 32), Z.valueOf(16));
  }
}
