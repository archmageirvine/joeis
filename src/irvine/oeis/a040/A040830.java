package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040830 Continued fraction for sqrt(860).
 * @author Georg Fischer
 */
public class A040830 extends PrependSequence {

  /** Construct the sequence. */
  public A040830() {
    super(new PeriodicSequence(3, 14, 3, 58), Z.valueOf(29));
  }
}
