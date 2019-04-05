package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040398 Continued fraction for sqrt(419).
 * @author Georg Fischer
 */
public class A040398 extends PrependSequence {

  /** Construct the sequence. */
  public A040398() {
    super(new PeriodicSequence(2, 7, 1, 2, 3, 1, 2, 1, 19, 1, 2, 1, 3, 2, 1, 7, 2, 40), Z.valueOf(20));
  }
}
