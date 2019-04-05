package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040814 Continued fraction for sqrt(844).
 * @author Georg Fischer
 */
public class A040814 extends PrependSequence {

  /** Construct the sequence. */
  public A040814() {
    super(new PeriodicSequence(19, 2, 1, 5, 1, 3, 1, 1, 1, 1, 1, 2, 6, 1, 7, 2, 3, 2, 2, 11, 4, 1, 3, 14, 3, 1, 4, 11, 2, 2, 3, 2, 7, 1, 6, 2, 1, 1, 1, 1, 1, 3, 1, 5, 1, 2, 19, 58), Z.valueOf(29));
  }
}
