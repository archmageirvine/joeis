package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040865 Continued fraction for <code>sqrt(895)</code>.
 * @author Georg Fischer
 */
public class A040865 extends PrependSequence {

  /** Construct the sequence. */
  public A040865() {
    super(new PeriodicSequence(1, 10, 1, 58), Z.valueOf(29));
  }
}
