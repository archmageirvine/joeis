package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040583 Continued fraction for <code>sqrt(608)</code>.
 * @author Georg Fischer
 */
public class A040583 extends PrependSequence {

  /** Construct the sequence. */
  public A040583() {
    super(new PeriodicSequence(1, 1, 1, 11, 1, 1, 1, 48), Z.valueOf(24));
  }
}
