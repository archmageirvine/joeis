package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040792 Continued fraction for <code>sqrt(821)</code>.
 * @author Georg Fischer
 */
public class A040792 extends PrependSequence {

  /** Construct the sequence. */
  public A040792() {
    super(new PeriodicSequence(1, 1, 1, 7, 1, 1, 10, 1, 13, 2, 2, 2, 1, 1, 1, 1, 2, 2, 2, 13, 1, 10, 1, 1, 7, 1, 1, 1, 56), Z.valueOf(28));
  }
}
