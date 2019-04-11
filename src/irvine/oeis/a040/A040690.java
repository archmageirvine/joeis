package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040690 Continued fraction for <code>sqrt(717)</code>.
 * @author Georg Fischer
 */
public class A040690 extends PrependSequence {

  /** Construct the sequence. */
  public A040690() {
    super(new PeriodicSequence(1, 3, 2, 12, 1, 16, 1, 12, 2, 3, 1, 52), Z.valueOf(26));
  }
}
