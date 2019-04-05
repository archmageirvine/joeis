package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040693 Continued fraction for sqrt(720).
 * @author Georg Fischer
 */
public class A040693 extends PrependSequence {

  /** Construct the sequence. */
  public A040693() {
    super(new PeriodicSequence(1, 4, 1, 52), Z.valueOf(26));
  }
}
