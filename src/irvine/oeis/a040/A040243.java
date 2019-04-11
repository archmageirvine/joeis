package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040243 Continued fraction for <code>sqrt(260)</code>.
 * @author Georg Fischer
 */
public class A040243 extends PrependSequence {

  /** Construct the sequence. */
  public A040243() {
    super(new PeriodicSequence(8, 32), Z.valueOf(16));
  }
}
