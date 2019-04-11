package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040262 Continued fraction for <code>sqrt(279)</code>.
 * @author Georg Fischer
 */
public class A040262 extends PrependSequence {

  /** Construct the sequence. */
  public A040262() {
    super(new PeriodicSequence(1, 2, 2, 1, 2, 2, 1, 32), Z.valueOf(16));
  }
}
