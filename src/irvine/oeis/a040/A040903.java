package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040903 Continued fraction for sqrt(934).
 * @author Georg Fischer
 */
public class A040903 extends PrependSequence {

  /** Construct the sequence. */
  public A040903() {
    super(new PeriodicSequence(1, 1, 3, 1, 1, 3, 30, 3, 1, 1, 3, 1, 1, 60), Z.valueOf(30));
  }
}
