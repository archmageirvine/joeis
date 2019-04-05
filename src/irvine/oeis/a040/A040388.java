package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040388 Continued fraction for sqrt(409).
 * @author Georg Fischer
 */
public class A040388 extends PrependSequence {

  /** Construct the sequence. */
  public A040388() {
    super(new PeriodicSequence(4, 2, 7, 1, 1, 1, 4, 2, 2, 13, 13, 2, 2, 4, 1, 1, 1, 7, 2, 4, 40), Z.valueOf(20));
  }
}
