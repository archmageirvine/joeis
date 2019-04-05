package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040742 Continued fraction for sqrt(770).
 * @author Georg Fischer
 */
public class A040742 extends PrependSequence {

  /** Construct the sequence. */
  public A040742() {
    super(new PeriodicSequence(1, 2, 1, 54), Z.valueOf(27));
  }
}
