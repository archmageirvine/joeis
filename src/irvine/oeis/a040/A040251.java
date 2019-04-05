package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040251 Continued fraction for sqrt(268).
 * @author Georg Fischer
 */
public class A040251 extends PrependSequence {

  /** Construct the sequence. */
  public A040251() {
    super(new PeriodicSequence(2, 1, 2, 3, 3, 1, 3, 1, 10, 8, 10, 1, 3, 1, 3, 3, 2, 1, 2, 32), Z.valueOf(16));
  }
}
