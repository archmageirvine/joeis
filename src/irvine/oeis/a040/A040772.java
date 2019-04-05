package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040772 Continued fraction for sqrt(801).
 * @author Georg Fischer
 */
public class A040772 extends PrependSequence {

  /** Construct the sequence. */
  public A040772() {
    super(new PeriodicSequence(3, 3, 4, 1, 5, 2, 10, 1, 6, 6, 6, 1, 10, 2, 5, 1, 4, 3, 3, 56), Z.valueOf(28));
  }
}
