package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040797 Continued fraction for sqrt(826).
 * @author Georg Fischer
 */
public class A040797 extends PrependSequence {

  /** Construct the sequence. */
  public A040797() {
    super(new PeriodicSequence(1, 2, 1, 5, 1, 1, 1, 3, 5, 2, 9, 8, 9, 2, 5, 3, 1, 1, 1, 5, 1, 2, 1, 56), Z.valueOf(28));
  }
}
