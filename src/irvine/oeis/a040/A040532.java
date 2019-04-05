package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040532 Continued fraction for sqrt(556).
 * @author Georg Fischer
 */
public class A040532 extends PrependSequence {

  /** Construct the sequence. */
  public A040532() {
    super(new PeriodicSequence(1, 1, 2, 1, 1, 1, 3, 3, 2, 1, 5, 5, 15, 1, 1, 8, 1, 10, 1, 8, 1, 1, 15, 5, 5, 1, 2, 3, 3, 1, 1, 1, 2, 1, 1, 46), Z.valueOf(23));
  }
}
