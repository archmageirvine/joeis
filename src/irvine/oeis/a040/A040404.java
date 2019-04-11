package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040404 Continued fraction for <code>sqrt(425)</code>.
 * @author Georg Fischer
 */
public class A040404 extends PrependSequence {

  /** Construct the sequence. */
  public A040404() {
    super(new PeriodicSequence(1, 1, 1, 1, 1, 1, 40), Z.valueOf(20));
  }
}
