package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040185 Continued fraction for <code>sqrt(200)</code>.
 * @author Georg Fischer
 */
public class A040185 extends PrependSequence {

  /** Construct the sequence. */
  public A040185() {
    super(new PeriodicSequence(7, 28), Z.valueOf(14));
  }
}
