package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040605 Continued fraction for sqrt(631).
 * @author Georg Fischer
 */
public class A040605 extends PrependSequence {

  /** Construct the sequence. */
  public A040605() {
    super(new PeriodicSequence(8, 2, 1, 4, 1, 9, 4, 2, 6, 1, 2, 1, 2, 1, 1, 1, 1, 4, 2, 2, 2, 1, 16, 25, 16, 1, 2, 2, 2, 4, 1, 1, 1, 1, 2, 1, 2, 1, 6, 2, 4, 9, 1, 4, 1, 2, 8, 50), Z.valueOf(25));
  }
}
