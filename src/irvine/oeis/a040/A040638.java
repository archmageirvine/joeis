package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040638 Continued fraction for <code>sqrt(664)</code>.
 * @author Georg Fischer
 */
public class A040638 extends PrependSequence {

  /** Construct the sequence. */
  public A040638() {
    super(new PeriodicSequence(1, 3, 3, 5, 2, 2, 1, 1, 2, 1, 5, 1, 2, 1, 1, 2, 2, 5, 3, 3, 1, 50), Z.valueOf(25));
  }
}
