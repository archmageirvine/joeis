package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040519 Continued fraction for sqrt(543).
 * @author Georg Fischer
 */
public class A040519 extends PrependSequence {

  /** Construct the sequence. */
  public A040519() {
    super(new PeriodicSequence(3, 3, 3, 1, 14, 1, 3, 3, 3, 46), Z.valueOf(23));
  }
}
