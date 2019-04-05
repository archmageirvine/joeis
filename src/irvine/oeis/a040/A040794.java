package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040794 Continued fraction for sqrt(823).
 * @author Georg Fischer
 */
public class A040794 extends PrependSequence {

  /** Construct the sequence. */
  public A040794() {
    super(new PeriodicSequence(1, 2, 4, 1, 7, 2, 1, 1, 1, 1, 8, 1, 18, 4, 2, 1, 3, 2, 2, 5, 1, 27, 1, 5, 2, 2, 3, 1, 2, 4, 18, 1, 8, 1, 1, 1, 1, 2, 7, 1, 4, 2, 1, 56), Z.valueOf(28));
  }
}
