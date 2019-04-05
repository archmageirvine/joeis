package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040488 Continued fraction for sqrt(511).
 * @author Georg Fischer
 */
public class A040488 extends PrependSequence {

  /** Construct the sequence. */
  public A040488() {
    super(new PeriodicSequence(1, 1, 1, 1, 6, 1, 14, 4, 1, 21, 1, 4, 14, 1, 6, 1, 1, 1, 1, 44), Z.valueOf(22));
  }
}
