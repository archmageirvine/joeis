package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040667 Continued fraction for sqrt(694).
 * @author Georg Fischer
 */
public class A040667 extends PrependSequence {

  /** Construct the sequence. */
  public A040667() {
    super(new PeriodicSequence(2, 1, 9, 1, 6, 1, 1, 1, 1, 1, 2, 1, 8, 17, 2, 4, 3, 3, 2, 4, 1, 5, 26, 5, 1, 4, 2, 3, 3, 4, 2, 17, 8, 1, 2, 1, 1, 1, 1, 1, 6, 1, 9, 1, 2, 52), Z.valueOf(26));
  }
}
