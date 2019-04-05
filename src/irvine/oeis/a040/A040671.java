package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040671 Continued fraction for sqrt(698).
 * @author Georg Fischer
 */
public class A040671 extends PrependSequence {

  /** Construct the sequence. */
  public A040671() {
    super(new PeriodicSequence(2, 2, 1, 1, 1, 1, 2, 2, 52), Z.valueOf(26));
  }
}
