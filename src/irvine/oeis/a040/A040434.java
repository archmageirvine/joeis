package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040434 Continued fraction for <code>sqrt(456)</code>.
 * @author Georg Fischer
 */
public class A040434 extends PrependSequence {

  /** Construct the sequence. */
  public A040434() {
    super(new PeriodicSequence(2, 1, 4, 1, 2, 42), Z.valueOf(21));
  }
}
