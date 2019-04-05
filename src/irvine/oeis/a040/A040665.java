package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040665 Continued fraction for sqrt(692).
 * @author Georg Fischer
 */
public class A040665 extends PrependSequence {

  /** Construct the sequence. */
  public A040665() {
    super(new PeriodicSequence(3, 3, 1, 2, 1, 1, 12, 1, 1, 2, 1, 3, 3, 52), Z.valueOf(26));
  }
}
