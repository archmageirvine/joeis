package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040052 Continued fraction for <code>sqrt(60)</code>.
 * @author Georg Fischer
 */
public class A040052 extends PrependSequence {

  /** Construct the sequence. */
  public A040052() {
    super(new PeriodicSequence(1, 2, 1, 14), Z.SEVEN);
  }
}
