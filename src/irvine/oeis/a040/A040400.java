package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040400 Continued fraction for sqrt(421).
 * @author Georg Fischer
 */
public class A040400 extends PrependSequence {

  /** Construct the sequence. */
  public A040400() {
    super(new PeriodicSequence(1, 1, 13, 5, 1, 3, 1, 2, 1, 1, 1, 2, 9, 1, 7, 3, 3, 2, 2, 3, 3, 7, 1, 9, 2, 1, 1, 1, 2, 1, 3, 1, 5, 13, 1, 1, 40), Z.valueOf(20));
  }
}
