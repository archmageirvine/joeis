package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040848 Continued fraction for <code>sqrt(878)</code>.
 * @author Georg Fischer
 */
public class A040848 extends PrependSequence {

  /** Construct the sequence. */
  public A040848() {
    super(new PeriodicSequence(1, 1, 1, 2, 2, 4, 1, 28, 1, 4, 2, 2, 1, 1, 1, 58), Z.valueOf(29));
  }
}
