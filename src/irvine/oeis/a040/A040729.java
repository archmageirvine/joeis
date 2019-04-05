package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040729 Continued fraction for sqrt(757).
 * @author Georg Fischer
 */
public class A040729 extends PrependSequence {

  /** Construct the sequence. */
  public A040729() {
    super(new PeriodicSequence(1, 1, 17, 1, 5, 5, 1, 17, 1, 1, 54), Z.valueOf(27));
  }
}
