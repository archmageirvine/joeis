package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040885 Continued fraction for <code>sqrt(916)</code>.
 * @author Georg Fischer
 */
public class A040885 extends PrependSequence {

  /** Construct the sequence. */
  public A040885() {
    super(new PeriodicSequence(3, 1, 3, 3, 1, 1, 14, 1, 1, 3, 3, 1, 3, 60), Z.valueOf(30));
  }
}
