package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040581 Continued fraction for sqrt(606).
 * @author Georg Fischer
 */
public class A040581 extends PrependSequence {

  /** Construct the sequence. */
  public A040581() {
    super(new PeriodicSequence(1, 1, 1, 1, 1, 1, 2, 1, 9, 8, 9, 1, 2, 1, 1, 1, 1, 1, 1, 48), Z.valueOf(24));
  }
}
