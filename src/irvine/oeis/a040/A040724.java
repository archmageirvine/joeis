package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040724 Continued fraction for <code>sqrt(752)</code>.
 * @author Georg Fischer
 */
public class A040724 extends PrependSequence {

  /** Construct the sequence. */
  public A040724() {
    super(new PeriodicSequence(2, 2, 1, 2, 1, 2, 2, 54), Z.valueOf(27));
  }
}
