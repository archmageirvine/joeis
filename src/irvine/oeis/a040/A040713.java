package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040713 Continued fraction for sqrt(741).
 * @author Georg Fischer
 */
public class A040713 extends PrependSequence {

  /** Construct the sequence. */
  public A040713() {
    super(new PeriodicSequence(4, 1, 1, 13, 18, 13, 1, 1, 4, 54), Z.valueOf(27));
  }
}
