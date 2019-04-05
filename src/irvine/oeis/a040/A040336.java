package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040336 Continued fraction for sqrt(355).
 * @author Georg Fischer
 */
public class A040336 extends PrependSequence {

  /** Construct the sequence. */
  public A040336() {
    super(new PeriodicSequence(1, 5, 3, 3, 1, 6, 1, 3, 3, 5, 1, 36), Z.valueOf(18));
  }
}
