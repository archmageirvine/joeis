package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040737 Continued fraction for <code>sqrt(765)</code>.
 * @author Georg Fischer
 */
public class A040737 extends PrependSequence {

  /** Construct the sequence. */
  public A040737() {
    super(new PeriodicSequence(1, 1, 1, 13, 6, 13, 1, 1, 1, 54), Z.valueOf(27));
  }
}
