package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040740 Continued fraction for <code>sqrt(768)</code>.
 * @author Georg Fischer
 */
public class A040740 extends PrependSequence {

  /** Construct the sequence. */
  public A040740() {
    super(new PeriodicSequence(1, 2, 2, 13, 2, 2, 1, 54), Z.valueOf(27));
  }
}
