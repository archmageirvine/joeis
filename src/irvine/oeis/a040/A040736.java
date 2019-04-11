package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040736 Continued fraction for <code>sqrt(764)</code>.
 * @author Georg Fischer
 */
public class A040736 extends PrependSequence {

  /** Construct the sequence. */
  public A040736() {
    super(new PeriodicSequence(1, 1, 1, 3, 1, 1, 2, 2, 1, 6, 4, 1, 7, 10, 1, 12, 1, 10, 7, 1, 4, 6, 1, 2, 2, 1, 1, 3, 1, 1, 1, 54), Z.valueOf(27));
  }
}
