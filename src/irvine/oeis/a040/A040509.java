package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040509 Continued fraction for sqrt(533).
 * @author Georg Fischer
 */
public class A040509 extends PrependSequence {

  /** Construct the sequence. */
  public A040509() {
    super(new PeriodicSequence(11, 1, 1, 11, 46), Z.valueOf(23));
  }
}
