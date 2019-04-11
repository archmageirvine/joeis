package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040259 Continued fraction for <code>sqrt(276)</code>.
 * @author Georg Fischer
 */
public class A040259 extends PrependSequence {

  /** Construct the sequence. */
  public A040259() {
    super(new PeriodicSequence(1, 1, 1, 1, 2, 2, 2, 1, 1, 1, 1, 32), Z.valueOf(16));
  }
}
