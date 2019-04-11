package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040133 Continued fraction for <code>sqrt(146)</code>.
 * @author Georg Fischer
 */
public class A040133 extends PrependSequence {

  /** Construct the sequence. */
  public A040133() {
    super(new PeriodicSequence(12, 24), Z.valueOf(12));
  }
}
