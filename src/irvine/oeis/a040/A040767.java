package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040767 Continued fraction for sqrt(796).
 * @author Georg Fischer
 */
public class A040767 extends PrependSequence {

  /** Construct the sequence. */
  public A040767() {
    super(new PeriodicSequence(4, 1, 2, 5, 1, 10, 2, 3, 1, 6, 3, 1, 1, 1, 1, 2, 4, 1, 2, 1, 18, 14, 18, 1, 2, 1, 4, 2, 1, 1, 1, 1, 3, 6, 1, 3, 2, 10, 1, 5, 2, 1, 4, 56), Z.valueOf(28));
  }
}
