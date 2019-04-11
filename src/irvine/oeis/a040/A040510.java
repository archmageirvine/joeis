package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040510 Continued fraction for <code>sqrt(534)</code>.
 * @author Georg Fischer
 */
public class A040510 extends PrependSequence {

  /** Construct the sequence. */
  public A040510() {
    super(new PeriodicSequence(9, 4, 1, 1, 22, 1, 1, 4, 9, 46), Z.valueOf(23));
  }
}
