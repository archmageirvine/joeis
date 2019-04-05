package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040529 Continued fraction for sqrt(553).
 * @author Georg Fischer
 */
public class A040529 extends PrependSequence {

  /** Construct the sequence. */
  public A040529() {
    super(new PeriodicSequence(1, 1, 15, 5, 1, 4, 2, 1, 1, 3, 1, 2, 6, 2, 1, 3, 1, 1, 2, 4, 1, 5, 15, 1, 1, 46), Z.valueOf(23));
  }
}
