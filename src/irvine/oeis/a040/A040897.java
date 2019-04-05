package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040897 Continued fraction for sqrt(928).
 * @author Georg Fischer
 */
public class A040897 extends PrependSequence {

  /** Construct the sequence. */
  public A040897() {
    super(new PeriodicSequence(2, 6, 3, 1, 1, 1, 8, 15, 8, 1, 1, 1, 3, 6, 2, 60), Z.valueOf(30));
  }
}
