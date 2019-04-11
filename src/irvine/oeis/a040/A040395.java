package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040395 Continued fraction for <code>sqrt(416)</code>.
 * @author Georg Fischer
 */
public class A040395 extends PrependSequence {

  /** Construct the sequence. */
  public A040395() {
    super(new PeriodicSequence(2, 1, 1, 9, 1, 1, 2, 40), Z.valueOf(20));
  }
}
