package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040746 Continued fraction for sqrt(774).
 * @author Georg Fischer
 */
public class A040746 extends PrependSequence {

  /** Construct the sequence. */
  public A040746() {
    super(new PeriodicSequence(1, 4, 1, 1, 2, 1, 1, 4, 1, 54), Z.valueOf(27));
  }
}
