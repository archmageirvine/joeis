package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040739 Continued fraction for <code>sqrt(767)</code>.
 * @author Georg Fischer
 */
public class A040739 extends PrependSequence {

  /** Construct the sequence. */
  public A040739() {
    super(new PeriodicSequence(1, 2, 3, 1, 1, 1, 1, 1, 3, 2, 1, 54), Z.valueOf(27));
  }
}
