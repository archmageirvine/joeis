package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040569 Continued fraction for <code>sqrt(594)</code>.
 * @author Georg Fischer
 */
public class A040569 extends PrependSequence {

  /** Construct the sequence. */
  public A040569() {
    super(new PeriodicSequence(2, 1, 2, 5, 24, 5, 2, 1, 2, 48), Z.valueOf(24));
  }
}
