package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040617 Continued fraction for sqrt(643).
 * @author Georg Fischer
 */
public class A040617 extends PrependSequence {

  /** Construct the sequence. */
  public A040617() {
    super(new PeriodicSequence(2, 1, 3, 1, 16, 8, 2, 1, 1, 5, 25, 5, 1, 1, 2, 8, 16, 1, 3, 1, 2, 50), Z.valueOf(25));
  }
}
