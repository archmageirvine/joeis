package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040591 Continued fraction for sqrt(616).
 * @author Georg Fischer
 */
public class A040591 extends PrependSequence {

  /** Construct the sequence. */
  public A040591() {
    super(new PeriodicSequence(1, 4, 1, 1, 6, 1, 1, 4, 1, 48), Z.valueOf(24));
  }
}
