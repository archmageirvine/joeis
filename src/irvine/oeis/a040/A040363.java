package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040363 Continued fraction for <code>sqrt(383)</code>.
 * @author Georg Fischer
 */
public class A040363 extends PrependSequence {

  /** Construct the sequence. */
  public A040363() {
    super(new PeriodicSequence(1, 1, 3, 19, 3, 1, 1, 38), Z.valueOf(19));
  }
}
