package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040503 Continued fraction for sqrt(526).
 * @author Georg Fischer
 */
public class A040503 extends PrependSequence {

  /** Construct the sequence. */
  public A040503() {
    super(new PeriodicSequence(1, 14, 3, 4, 1, 3, 2, 1, 3, 1, 8, 2, 1, 1, 2, 2, 6, 7, 2, 22, 2, 7, 6, 2, 2, 1, 1, 2, 8, 1, 3, 1, 2, 3, 1, 4, 3, 14, 1, 44), Z.valueOf(22));
  }
}
