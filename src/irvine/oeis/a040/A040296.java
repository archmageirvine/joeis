package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040296 Continued fraction for sqrt(314).
 * @author Georg Fischer
 */
public class A040296 extends PrependSequence {

  /** Construct the sequence. */
  public A040296() {
    super(new PeriodicSequence(1, 2, 1, 1, 2, 1, 34), Z.valueOf(17));
  }
}
