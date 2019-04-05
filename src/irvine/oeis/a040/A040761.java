package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040761 Continued fraction for sqrt(790).
 * @author Georg Fischer
 */
public class A040761 extends PrependSequence {

  /** Construct the sequence. */
  public A040761() {
    super(new PeriodicSequence(9, 2, 1, 5, 1, 1, 3, 4, 1, 4, 1, 4, 3, 1, 1, 5, 1, 2, 9, 56), Z.valueOf(28));
  }
}
