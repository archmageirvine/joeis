package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040922 Continued fraction for sqrt(953).
 * @author Georg Fischer
 */
public class A040922 extends PrependSequence {

  /** Construct the sequence. */
  public A040922() {
    super(new PeriodicSequence(1, 6, 1, 2, 1, 3, 8, 1, 1, 4, 4, 1, 1, 8, 3, 1, 2, 1, 6, 1, 60), Z.valueOf(30));
  }
}
