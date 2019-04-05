package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040196 Continued fraction for sqrt(211).
 * @author Georg Fischer
 */
public class A040196 extends PrependSequence {

  /** Construct the sequence. */
  public A040196() {
    super(new PeriodicSequence(1, 1, 9, 5, 1, 2, 2, 1, 1, 4, 3, 1, 13, 1, 3, 4, 1, 1, 2, 2, 1, 5, 9, 1, 1, 28), Z.valueOf(14));
  }
}
