package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040349 Continued fraction for sqrt(369).
 * @author Georg Fischer
 */
public class A040349 extends PrependSequence {

  /** Construct the sequence. */
  public A040349() {
    super(new PeriodicSequence(4, 1, 3, 2, 7, 4, 7, 2, 3, 1, 4, 38), Z.valueOf(19));
  }
}
