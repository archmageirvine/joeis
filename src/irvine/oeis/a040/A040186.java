package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040186 Continued fraction for <code>sqrt(201)</code>.
 * @author Georg Fischer
 */
public class A040186 extends PrependSequence {

  /** Construct the sequence. */
  public A040186() {
    super(new PeriodicSequence(5, 1, 1, 1, 2, 1, 8, 1, 2, 1, 1, 1, 5, 28), Z.valueOf(14));
  }
}
