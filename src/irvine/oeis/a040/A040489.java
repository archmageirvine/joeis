package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040489 Continued fraction for sqrt(512).
 * @author Georg Fischer
 */
public class A040489 extends PrependSequence {

  /** Construct the sequence. */
  public A040489() {
    super(new PeriodicSequence(1, 1, 1, 2, 6, 11, 6, 2, 1, 1, 1, 44), Z.valueOf(22));
  }
}
