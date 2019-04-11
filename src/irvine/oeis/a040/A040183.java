package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040183 Continued fraction for <code>sqrt(198)</code>.
 * @author Georg Fischer
 */
public class A040183 extends PrependSequence {

  /** Construct the sequence. */
  public A040183() {
    super(new PeriodicSequence(14, 28), Z.valueOf(14));
  }
}
