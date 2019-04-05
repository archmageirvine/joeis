package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040410 Continued fraction for sqrt(431).
 * @author Georg Fischer
 */
public class A040410 extends PrependSequence {

  /** Construct the sequence. */
  public A040410() {
    super(new PeriodicSequence(1, 3, 5, 1, 2, 7, 1, 19, 1, 7, 2, 1, 5, 3, 1, 40), Z.valueOf(20));
  }
}
