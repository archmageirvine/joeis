package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040457 Continued fraction for <code>sqrt(479)</code>.
 * @author Georg Fischer
 */
public class A040457 extends PrependSequence {

  /** Construct the sequence. */
  public A040457() {
    super(new PeriodicSequence(1, 7, 1, 3, 2, 21, 2, 3, 1, 7, 1, 42), Z.valueOf(21));
  }
}
