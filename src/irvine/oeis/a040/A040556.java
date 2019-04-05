package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040556 Continued fraction for sqrt(581).
 * @author Georg Fischer
 */
public class A040556 extends PrependSequence {

  /** Construct the sequence. */
  public A040556() {
    super(new PeriodicSequence(9, 1, 1, 1, 1, 1, 3, 11, 1, 3, 2, 6, 2, 3, 1, 11, 3, 1, 1, 1, 1, 1, 9, 48), Z.valueOf(24));
  }
}
