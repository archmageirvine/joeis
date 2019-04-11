package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040445 Continued fraction for <code>sqrt(467)</code>.
 * @author Georg Fischer
 */
public class A040445 extends PrependSequence {

  /** Construct the sequence. */
  public A040445() {
    super(new PeriodicSequence(1, 1, 1, 1, 3, 3, 21, 3, 3, 1, 1, 1, 1, 42), Z.valueOf(21));
  }
}
