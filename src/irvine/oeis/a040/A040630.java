package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040630 Continued fraction for <code>sqrt(656)</code>.
 * @author Georg Fischer
 */
public class A040630 extends PrependSequence {

  /** Construct the sequence. */
  public A040630() {
    super(new PeriodicSequence(1, 1, 1, 1, 2, 1, 1, 1, 1, 50), Z.valueOf(25));
  }
}
