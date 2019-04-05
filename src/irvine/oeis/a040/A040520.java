package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040520 Continued fraction for sqrt(544).
 * @author Georg Fischer
 */
public class A040520 extends PrependSequence {

  /** Construct the sequence. */
  public A040520() {
    super(new PeriodicSequence(3, 11, 3, 46), Z.valueOf(23));
  }
}
