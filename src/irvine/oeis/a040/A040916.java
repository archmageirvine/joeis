package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040916 Continued fraction for <code>sqrt(947)</code>.
 * @author Georg Fischer
 */
public class A040916 extends PrependSequence {

  /** Construct the sequence. */
  public A040916() {
    super(new PeriodicSequence(1, 3, 2, 2, 2, 1, 4, 1, 7, 1, 29, 1, 7, 1, 4, 1, 2, 2, 2, 3, 1, 60), Z.valueOf(30));
  }
}
