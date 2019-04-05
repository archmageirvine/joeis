package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040799 Continued fraction for sqrt(828).
 * @author Georg Fischer
 */
public class A040799 extends PrependSequence {

  /** Construct the sequence. */
  public A040799() {
    super(new PeriodicSequence(1, 3, 2, 3, 1, 56), Z.valueOf(28));
  }
}
