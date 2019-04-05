package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040568 Continued fraction for sqrt(593).
 * @author Georg Fischer
 */
public class A040568 extends PrependSequence {

  /** Construct the sequence. */
  public A040568() {
    super(new PeriodicSequence(2, 1, 5, 2, 2, 1, 1, 2, 2, 5, 1, 2, 48), Z.valueOf(24));
  }
}
