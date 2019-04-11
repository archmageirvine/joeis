package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040570 Continued fraction for <code>sqrt(595)</code>.
 * @author Georg Fischer
 */
public class A040570 extends PrependSequence {

  /** Construct the sequence. */
  public A040570() {
    super(new PeriodicSequence(2, 1, 1, 4, 1, 4, 1, 1, 2, 48), Z.valueOf(24));
  }
}
