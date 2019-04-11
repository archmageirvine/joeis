package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040844 Continued fraction for <code>sqrt(874)</code>.
 * @author Georg Fischer
 */
public class A040844 extends PrependSequence {

  /** Construct the sequence. */
  public A040844() {
    super(new PeriodicSequence(1, 1, 3, 2, 3, 1, 1, 58), Z.valueOf(29));
  }
}
