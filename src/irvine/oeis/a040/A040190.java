package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040190 Continued fraction for <code>sqrt(205)</code>.
 * @author Georg Fischer
 */
public class A040190 extends PrependSequence {

  /** Construct the sequence. */
  public A040190() {
    super(new PeriodicSequence(3, 6, 1, 4, 1, 6, 3, 28), Z.valueOf(14));
  }
}
