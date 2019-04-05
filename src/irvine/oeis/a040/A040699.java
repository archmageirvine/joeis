package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040699 Continued fraction for sqrt(726).
 * @author Georg Fischer
 */
public class A040699 extends PrependSequence {

  /** Construct the sequence. */
  public A040699() {
    super(new PeriodicSequence(1, 16, 1, 52), Z.valueOf(26));
  }
}
