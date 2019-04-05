package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040804 Continued fraction for sqrt(833).
 * @author Georg Fischer
 */
public class A040804 extends PrependSequence {

  /** Construct the sequence. */
  public A040804() {
    super(new PeriodicSequence(1, 6, 4, 3, 2, 1, 2, 1, 2, 3, 4, 6, 1, 56), Z.valueOf(28));
  }
}
