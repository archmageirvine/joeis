package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040374 Continued fraction for sqrt(394).
 * @author Georg Fischer
 */
public class A040374 extends PrependSequence {

  /** Construct the sequence. */
  public A040374() {
    super(new PeriodicSequence(1, 5, 1, 1, 1, 3, 1, 3, 5, 2, 2, 5, 3, 1, 3, 1, 1, 1, 5, 1, 38), Z.valueOf(19));
  }
}
