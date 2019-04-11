package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040566 Continued fraction for <code>sqrt(591)</code>.
 * @author Georg Fischer
 */
public class A040566 extends PrependSequence {

  /** Construct the sequence. */
  public A040566() {
    super(new PeriodicSequence(3, 4, 1, 1, 7, 1, 1, 4, 3, 48), Z.valueOf(24));
  }
}
