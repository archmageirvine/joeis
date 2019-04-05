package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040539 Continued fraction for sqrt(563).
 * @author Georg Fischer
 */
public class A040539 extends PrependSequence {

  /** Construct the sequence. */
  public A040539() {
    super(new PeriodicSequence(1, 2, 1, 2, 23, 2, 1, 2, 1, 46), Z.valueOf(23));
  }
}
