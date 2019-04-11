package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040634 Continued fraction for <code>sqrt(660)</code>.
 * @author Georg Fischer
 */
public class A040634 extends PrependSequence {

  /** Construct the sequence. */
  public A040634() {
    super(new PeriodicSequence(1, 2, 4, 2, 1, 50), Z.valueOf(25));
  }
}
