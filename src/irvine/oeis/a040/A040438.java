package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040438 Continued fraction for sqrt(460).
 * @author Georg Fischer
 */
public class A040438 extends PrependSequence {

  /** Construct the sequence. */
  public A040438() {
    super(new PeriodicSequence(2, 4, 3, 1, 2, 10, 2, 1, 3, 4, 2, 42), Z.valueOf(21));
  }
}
